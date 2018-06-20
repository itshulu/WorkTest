import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;

public class fileUpdate extends ActionSupport {
    private File file1;
    private String file1FileName;
    private String  file1ContentType;

    public void setFile1(File file1) {
        this.file1 = file1;
    }

    public void setFile1FileName(String file1FileName) {
        this.file1FileName = file1FileName;
    }

    public void setFile1ContentType(String file1ContentType) {
        this.file1ContentType = file1ContentType;
    }

    @Override
    public String execute() throws Exception {
        String path=ServletActionContext.getServletContext().getRealPath("/uplod");
        File file=new File(path,file1FileName);
        FileUtils.copyFile(file1,file);
        return SUCCESS;
    }
}
