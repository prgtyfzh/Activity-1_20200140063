/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.tugas.java;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.projectService;

/**
 *
 * @author Pragitya Faazha
 */
@Controller
public class projectController {
     projectService serv = new projectService();
    
    @RequestMapping("/viewUtility")
    @ResponseBody
    public ArrayList<String> getDataUtil() {
        return serv.tabel();
    }
    
    @RequestMapping("/dataktp")
    public String tampil (Model kurir) {
        
        ArrayList<String> paket = new ArrayList<>();
        
        paket = serv.tabel(); //u mengisi arrayList lokal
        
        kurir.addAttribute("datapenduduk", paket); //proses mengirim data yang ada di arraylist
        
        return "view"; //didalam tanda petik adl nama file html
    }
}