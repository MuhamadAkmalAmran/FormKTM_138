/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws2.FormKTM;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author akmal
 */
@Controller
public class ktmController {
    
    @RequestMapping ("/formkt")
    
    public String formktm(
            @RequestParam("nama")String namaMhs,
            @RequestParam("nim")String nimMhs,
            @RequestParam("email")String emailMhs,
            Model input
    ){
        
        return "viewpage";
    }
    
    
}
