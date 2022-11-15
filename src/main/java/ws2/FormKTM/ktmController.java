/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws2.FormKTM;

import java.io.IOException;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author akmal
 */
@Controller
public class ktmController {

    @RequestMapping("/formktm")

    public String formktm(
            @RequestParam("nama") String namaMhs,
            @RequestParam("nim") String nimMhs,
            @RequestParam("email") String emailMhs,
            @RequestParam("foto") MultipartFile image,
            @RequestParam("prodi") String prodiMhs,
            Model input
    ) throws IOException 
    
    {
        byte[] img = image.getBytes();
        String inputImg = Base64.encodeBase64String(img);
        String fotoMhs = "data:image/png;base64,".concat(inputImg);
        input.addAttribute("nama1", namaMhs);
        input.addAttribute("nim1", nimMhs);
        input.addAttribute("email1", emailMhs);
        input.addAttribute("prodi1", prodiMhs);
        input.addAttribute("foto1", fotoMhs);

        return "viewpage";
    }

}
