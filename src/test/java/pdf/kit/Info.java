package pdf.kit;

import lombok.Data;

import java.io.Serializable;

@Data
public class Info implements Serializable {

    private String employeeName;
    private String employeeSex;
    private String imageUrl;

    public Info(String employeeName, String employeeSex) {
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
    }
}
