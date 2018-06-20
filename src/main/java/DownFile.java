import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;

public class DownFile extends ActionSupport {
    private String fileName;

    public void setFileName(String fileName) {
        try {
            fileName=new String(fileName.getBytes("ISO8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.fileName = fileName;
    }

    public String list() {
        String path = ServletActionContext.getServletContext().getRealPath("/uplod");
        File file = new File(path);
        String[] fileName = file.list();
        System.out.println(Arrays.toString(fileName));
        ActionContext ac = ActionContext.getContext();
        Map<String, Object> request = (Map<String, Object>) ac.get("request");
        request.put("fileName", fileName);
        return "list";
    }

    public String down() {
        return "download";
    }

    public InputStream getAttrInputStream(){
        return ServletActionContext.getServletContext().getResourceAsStream("/uplod/"+fileName);
    }
    public String getDownFileName(){
        try {
            fileName=URLEncoder.encode("UTF-8",fileName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
