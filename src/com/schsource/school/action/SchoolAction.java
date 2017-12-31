package com.schsource.school.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.schsource.school.service.SchoolService;
import com.schsource.school.vo.School;
import com.schsource.utils.PageBean;
import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;
import sun.jvm.hotspot.debugger.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;

/**
 * @author vodka
 * @version 1.0 2017-12-29
 */

public class SchoolAction extends ActionSupport implements ModelDriven<School>{

    private static final int BUFFER_SIZE = 40 * 40;
    private School school = new School();
    private SchoolService schoolService;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String savePath;
    private int page;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public void setSchoolService(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @Override
    public School getModel() {
        return school;
    }

    /**
     * 将源文件复制成目标文件
     * @param source 源文件对象
     * @param target 目标文件对象
     */
    private static void copy(File source, File target) {
        // 声明一个输入流
        InputStream inputStream = null;
        // 声明一个输出流
        OutputStream outputStream = null;
        try {
            // 实例化输入流
            inputStream = new BufferedInputStream(new FileInputStream(source),BUFFER_SIZE);
            // 实例化输出流
            outputStream = new BufferedOutputStream(new FileOutputStream(target), BUFFER_SIZE);
            // 定义字节数组buffer
            byte[] buffer = new byte[BUFFER_SIZE];
            // 定义临时参数变量
            int length = 0;
            while ((length = inputStream.read(buffer)) > 0){
                // 如果上传的文件字节数大于0，将内容以字节的形式写入
                outputStream.write(buffer, 0, length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                try {
                    // 关闭输入流
                    inputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (null != outputStream) {
                try {
                    // 关闭输出流
                    outputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /**
     * 添加院校信息
     * @return success
     * @throws Exception
     */
    public String saveSchool() {
        String path = ServletActionContext.getServletContext().getRealPath("/upload")
                + this.getUploadFileName();
        school.setSchpic(this.uploadFileName);
        File target = new File(path);
        copy(this.upload, target);
        schoolService.saveSchool(school);
        return SUCCESS;
    }

    /**
     * 查看全部院校信息
     * @return
     */
    public String listAllSchool() {
        PageBean<School> pageBean = schoolService.findByPage(page);
        ActionContext.getContext().getValueStack().set("PageBean", pageBean);
        return SUCCESS;
    }

    /**
     * 根据Id查询院校信息
     * @return
     */
    public String getSchoolById() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        int schId = Integer.parseInt(request.getParameter("schId"));
        School school = schoolService.findSchoolById(schId);
        session.setAttribute("schId", school.getSchid());
        session.setAttribute("schName",school.getSchname());
        session.setAttribute("schPic", school.getSchpic());
        session.setAttribute("pId", school.getPname());
        session.setAttribute("tId", school.getTname());
        session.setAttribute("schAddress", school.getSchaddress());
        session.setAttribute("teacher", school.getTeacher());
        session.setAttribute("tel", school.getTel());
        return SUCCESS;
    }

    /**
     * 修改院校信息
     * @return
     */
    public String updateSchool() {
        schoolService.updateSchool(school);
        return SUCCESS;
    }

    /**
     * 删除院校信息
     * @return
     */
    public String removeSchool() {
        schoolService.deleteSchool(school);
        return SUCCESS;
    }

    /**
     * 根据Id统计院校信息
     * @return
     */
    public String countSchoolByName() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String tname = (String) request.getAttribute("tname");
        schoolService.countByTname(tname);
        return SUCCESS;
    }
}
