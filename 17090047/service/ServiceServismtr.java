package service;

import entity.*;
import java.util.*;

public class ServiceServismtr {
    private static List<Servismtr> data = new LinkedList<Servismtr>();

    public void tambahData(Servismtr srv){
        ServiceServismtr.data.add(srv);
        System.out.println("data telah tersimpan");
    }

    public void ubahData(Servismtr srv){
        int result = data.indexOf(srv);
        if(result >= 0){
            data.set(result, srv);
            System.out.println("data telah berubah");
        }
    }

    public void hapusData(String id){
        int idx = data.indexOf(new Servismtr(id,"",""));
        if(idx >= 0){
            data.remove(idx);
            System.out.println("Data telah terhapus");
        }else {
            System.out.println("Tidak ada data");
        }
    }

    public void cetakData() {
        System.out.println("------------ cetak data ------------");
        int i=1;
        for(Servismtr srv : data){
            System.out.println("data ke-" + i++);
            System.out.println("------------------------------------");
            System.out.println(" ID             :" + srv.getId());
            System.out.println(" Pemilik        :" + srv.getPemilik());
            System.out.println(" Merk Motor     :" + srv.getMerk());
            System.out.println("------------------------------------");
        }
    }
}