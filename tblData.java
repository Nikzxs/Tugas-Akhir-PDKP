/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gor.ta;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nikzxs
 */
public class tblData {

private DefaultTableModel tabel=new DefaultTableModel();
    public tblData(){
        getTabel().addColumn("Lapangan");
        getTabel().addColumn("Tanggal");
        getTabel().addColumn("Durasi");
        getTabel().addColumn("Nama Pemesan");
        getTabel().addColumn("No. HP");
       
    }
   
    public DefaultTableModel getTabel(){
        return tabel;
    }
      

}    

