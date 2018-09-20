package com.example.a1005705286.ensayocliente;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente extends Thread {

    Socket s;

    @Override
    public void run() {
        try {
            s = new Socket("10.0.2.2", 5000);

            OutputStream os = s.getOutputStream();

            PrintWriter pw = new PrintWriter( new OutputStreamWriter(os));
            pw.println("Mensajeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            pw.flush();

        }catch (Exception e){
            //esto es para que muestre donde está el error
            e.getStackTrace();
        }
    }
}
