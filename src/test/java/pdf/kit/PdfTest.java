package pdf.kit;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.exception.ExceptionUtils;
import pdf.kit.component.PDFHeaderFooter;
import pdf.kit.component.PDFKit;


@Slf4j
public class PdfTest {

    public static void main(String[] args) {

        Info info = new Info("胡川", "先生");
        String path = createPDF(info, "offerTest.pdf");
        System.out.println("path = " + path);
        log.info("path = " + path);
    }

    public static String createPDF(Object data, String fileName) {
        //pdf保存路径
        try {
            //设置自定义PDF页眉页脚工具类
            PDFHeaderFooter headerFooter = new PDFHeaderFooter();
            PDFKit kit = new PDFKit();
            kit.setHeaderFooterBuilder(headerFooter);
            //设置输出路径
            kit.setSaveFilePath("/Users/sky/Desktop/pdf/offerTest.pdf");

            String saveFilePath = kit.exportToFile(fileName, data);
            return saveFilePath;
        } catch (Exception e) {
            log.error("PDF生成失败{}", ExceptionUtils.getFullStackTrace(e));
            return null;
        }
    }

}
