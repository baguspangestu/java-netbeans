package koneksijava;

import java.sql.*;

public class KoneksiJava {
    
    static void select(Connection koneksi) throws SQLException{
        // Buat Statement
        Statement myquery = koneksi.createStatement();

        // Eksekusi Statement
        ResultSet hasil = myquery.executeQuery ("select * from bukutelepon");

        // Menampilkan data
        while(hasil.next()){
            System.out.println(hasil.getString(1) + 
                "\t" + hasil.getString(2) + 
                "\t" + hasil.getString(3) + 
                "\t" + hasil.getString(4) +
                "\t" + hasil.getString(5)
            );
        }
    }

    static void insert(Connection koneksi, String a, String b, String c, String d) throws SQLException{
        // Statement Insert
        String query = "insert into bukutelepon (nama, alamat, telepon, handphone) values (?, ?, ?, ?)";
        PreparedStatement stmt = koneksi.prepareStatement(query);

        // Data Yang Akan Ditambahkan
        stmt.setString(1, a); // Nama
        stmt.setString(2, b); // Alamat
        stmt.setString(3, c); // Telepon
        stmt.setString(4, d); // Handphone

        // Eksekusi Statement
        stmt.execute();
        System.out.println("Data Berhasil Ditambahkan");
    }
    
    static void update(Connection koneksi, int a, String b, String c, String d, String e) throws SQLException{
        // Statement Update
        String query = "update bukutelepon set nama = ?, alamat = ?, telepon = ?, handphone = ? where id = ?";
        PreparedStatement stmt = koneksi.prepareStatement(query);
        
        // Data Yang Akan Ubah (Hanya Nama)
        stmt.setString(1, b); // Nama Baru
        stmt.setString(2, c); // Alamat Baru
        stmt.setString(3, d); // Telepone Baru
        stmt.setString(4, e); // Hadphone Baru
        stmt.setInt(5, a); // ID (id berapa yang mau diubah)

        // Eksekusi Statement
        stmt.executeUpdate();
        System.out.println("Data dengan ID:" + a + " Berhasil Diubah");
    }
    
    static void delete(Connection koneksi, int a) throws SQLException{
        // Statement Delete
        String query = "delete from bukutelepon where id = ?";
        PreparedStatement preparedStmt = koneksi.prepareStatement(query);
        
        // Data yang akan dihapus (berdasarkan ID)
        preparedStmt.setInt(1, a); // ID data yang akan dihapus

        // Eksekusi Statement
        preparedStmt.execute();
        System.out.println("Data dengan ID:" + a + " Berhasil Dihapus");
    }
    
    public static void main(String[] args) {
        try{
            // Load JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            // Koneksi Database
            Connection koneksi_jf = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_funda", "root", "");
            System.out.println("Database Connected");
            
            /////////////////////
            // PANGGIL METHODS //
            /////////////////////
            
            /* Insert (Koneksi, Nama, Alamat, Telepon, Handphone) */
            //insert(koneksi_jf, "Sardi", "Sukoharjo", "071122334455", "081122334455");
            
            /* Update (Koneksi, ID, Nama, Alamat, Telepon, Handphone) */
            //update(koneksi_jf, 2, "Andi", "Pringsewu", "077777777777", "088888888888");
            
            /* Delete (Koneksi, ID) */
            //delete(koneksi_jf, 2);
            
            /* Tampilkan Data */
            select(koneksi_jf);
            
            // Tutup Koneksi
            koneksi_jf.close();
            System.out.println("Koneksi Ditutup");
        }catch(Exception e){
            System.out.println("Terjadi Error");
            System.err.println(e);
        }
    }
    
}
