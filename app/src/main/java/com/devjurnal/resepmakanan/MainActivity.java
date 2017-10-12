package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();
        ResepModel resep5 = new ResepModel();

        // TODO 5. Masukkan data ke List
            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Nasi Grombyang");
            resep1.setPoster("http://lihatresep.com/wp-content/uploads/2017/02/Resep-Nasi-Grombyang-khas-Pemalang.jpg");
            resep1.setSummary("Nasi Grombyang adalah makanan khas yang berasal dari kota Pemalang JawaTengah.");
            resep1.setDetail(
                    "Bahan-Bahan :" +
                    "\n500 gram daging sandung lamur"+
                    "\n400 gram iga sapi"+
                    "\n2.500 ml air"+
                    "\n2 batang serai, diambil putihnya, dimemarkan"+
                    "\n2 lembar daun salam"+
                    "\n4 sdt garam"+
                    "\n4 sdt gula merah sisir"+
                    "\n1 batang daun bawang, diiris halus"+
                    "\n4 sdm minyak untuk menumis"+
                    "\n4 sdm bawang merah goreng untuk taburan"+

                    "\n\nBumbu Halus :"+

                    "\n1 1/2 sdt ketumbar"+
                    "\n1/2 sdt merica"+
                    "\n7 butir bawang merah"+
                    "\n4 siung bawang putih"+
                    "\n2 buah kluwek, diseduh"+
                    "\n50 gram kelapa parut, disangrai"+
                    "\n1 cm jahe"+
                    "\n2 cm kunyit, dibakar"+

                    "\n\nBahan Sambal Cabai Rawit :"+

                    "\n15 buah cabai rawit merah"+
                    "\n2 siung bawang putih"+
                    "\n1/8 sdt garam"+
                    "\n\nLangkah :" +

                    "\n1. Rebus daging, iga sapi, air, serai, dan daun salam sampai empuk. Angkat dan ukur 2.000 ml air kaldunya. Potong-potong daging dan iga sapi. Didihkan lagi."+
                    "\n2. Panaskan minyak. Tumis bumbu halus sampai harum. Tuang ke rebusan daging. Masukkan garam dan gula merah. Masak sampai matang. Tambahkan daun bawang. Aduk rata."+
                    "\n3. Sambal cabai rawit: rebus cabai rawit merah dan bawang putih sampai layu. Angkat dan tiriskan. Tambahkan garam. Haluskan."+
                    "\n4. Sajikan dengan sambal cabai rawit dan taburan bawang merah goreng.");
            listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Sate Madura");
            resep2.setPoster("http://www.tokomesin.com/wp-content/uploads/2015/08/Sate-Ayam-Madura-tokomesin.jpeg");
            resep2.setSummary("Sate Madura adalah makanan khas yang berasal dari kota Madura JawaTimur.");
            resep2.setDetail(
                    "Bahan Bahan :"+
                    "\n250 gram dada ayam"+
                    "\n1 sdm air jeruk nipis"+
                    "\n1/4 sdt garam"+

                    "\n\nBahan Bumbu :"+
                    "\n100 gram kacang (digoreng)"+
                    "\n2-3 buah bawang putih"+
                    "\n2 buah bawang merah"+
                    "\n3 buah kemiri (disangrai)"+
                    "\n1/2 sdt merica bubuk"+
                    "\n150 ml air"+
                    "\n3 sdm kecap"+
                    "\n1 sdm gula merah"+
                    "\n1/4 sdt garam (secukupnya)"+
                    "\n5 sdm minyak/secukupnya (untuk menumis)"+

                    "\n\nBahan Pelengkap :"+
                    "\nSecukupnya bawang goreng"+
                    "\nSecukupnya bawang merah (iris tipis)"+
                    "\nSecukupnya cabe rawit (iris)"+

                    "\n\nLangkah :"+
                    "\n1. Cuci ayam sampai bersih, potong berbentuk dadu. Lumuri ayam dengan jeruk nipis dan garam. Tusukkan ayam pada tusuk sate."+
                    "\n2. Haluskan semua bahan bumbu(aku bahannya dihaluskan pakai chopper/diulek, terus ditambah air. bisa juga diblender sih, tapi teksturnya lebih lembut). Tumis bumbu dengan minyak sambil diaduk hingga mengental. Matikan api."+
                    "\n3. Ambil 3 sdm bumbu, tambahkan 1 sdm kecap dan 1 sdm air sebagai bahan celupan sebelum dibakar.biarkan selama minimal 15 menit agar bumbu meresap."+
                    "\n4. Bakar sate hingga berwarna kecoklatan. Angkat, sajikan sate ayam dengan bumbu kacang dan bahan pelengkap."
            );
            listResep.add(resep2);

            resep3.setJudul("Tahu Gimbal");
            resep3.setPoster("http://indonesiana.co.id/wp-content/uploads/2016/06/Tahu-Gimbal.jpg");
            resep3.setSummary("Tahu Gimbal adalah makanan khas yang berasal dari kota Semarang JawaTengah.");
            resep3.setDetail(
                    "Bahan Bahan :"+
                    "\n1 buah tahu cina, potong 2×2 cm" +
                    "\n100 ml air" +
                    "\n1/2 sendok teh garam" +
                    "\n100 gram kol, diiris tipis, seduh sampai layu" +
                    "\n2 tangkai seledri, diiris halus untuk taburan:" +
                    "\n2 sendok makan bawang merah goreng untuk taburan" +
                    "\nkerupuk udang kecil untuk pelengkap" +
                    "\nminyak untuk menggoreng" +

                    "\nBahan Gimbal Udang :" +

                    "\n300 gram udang, dikupas" +
                    "\n150 gram tepung terigu protein sedang" +
                    "\n25 gram tepung beras" +
                    "\n1 sendok teh garam" +
                    "\n1/4 sendok teh merica bubuk" +
                    "\n2 butir telur, dikocok lepas bubuk" +
                    "\n150 ml air" +

                    "\n\nBahan Saus (per Porsi) :" +

                    "\n2 buah cabai rawit merah" +
                    "\n1 sendok teh petis" +
                    "\n1 siung bawang putih" +
                    "\n1/2 sendok teh gula merah" +
                    "\n1/2 sendok teh garam" +
                    "\n30 gram kacang tanah kulit, digoreng, dihaluskan" +
                    "\n2 sendok teh kecap manis" +
                    "\n2 sendok teh air asam jawa" +
                    "\n75 ml air"+

                    "\n\nLangkah :"+
                    "\n1. Rendam tahu dalam air dan garam. Diamkan 5 menit. Goreng sampai matang. Sisihkan."+
                    "\n2. Gimbal udang, aduk tepung terigu, tepung beras, garam, merica bubuk, dan air. Tambahkan telur. Aduk rata. Masukkan udang. Aduk rata. Ambil 1 sendok sayur adonan. Goreng sampai matang. Sisihkan."+
                    "\n3. Saus, haluskan cabai rawit, petis, bawang putih, gula merah, dan garam. Masukkan kacang tanah, ulek rata. Tambahkan kecap manis, air asam, dan air sambil diulek rata."+
                    "\n4. Tata potongan tahu, kol, dan gimbal udang. Siramkan saus. Taburi seledri dan bawang goreng. Sajikan bersama kerupuk udang."
            );

            listResep.add(resep3);
            resep4.setJudul("Sop Ayam");
            resep4.setPoster("http://resepcaramemasak.info/wp-content/uploads/2015/08/resep-sop-ayam.jpg");
            resep4.setSummary("Sop Ayam adalah masakan untuk keluarga, dengan citra rasa kaldu yang menggoda.");
            resep4.setDetail(
                    "Bahan :"+
                    "\n1 ekor ayam kampung" +
                    "\nBawang seledri atau daun bawang (sesuai selera)" +
                    "\n2 buah tomat segar" +
                    "\n3 buah kentang" +
                    "\n1 buah wortel" +
                    "\n3 buah bawang putih" +
                    "\n1 sdm garam" +
                    "\n½ sdt merica" +
                    "\n½ sdm penyedap rasa (tambahan)" +
                    "\n1L air bersih" +
                    "\nBawang goreng (tambahan)"+

                    "\n\nLangkah :"+
                    "\n1. Potong ayam menjadi beberapa bagian sesuai selera (Anda dapat memisahkan bagian tulang dan daging jika diinginkan)."+
                    "\n2. Cuci kentang dan kupas kulitnya hingga bersih."+
                    "\n3. Potong kentang menjadi bagian-bagian kecil sesuai selera."+
                    "\n4. Kupas wortel dan cuci hingga besih."+
                    "\n5. Potong wortel sesuai selera."+
                    "\n6. Cuci tomat hingga bersih."+
                    "\n7. Potong tomat sesuai selera."+
                    "\n8. Cuci bawang seledri atau daun bawang lalu iris."+
                    "\n9. Potong dan haluskan bawang putih."+
                    "\n10. Tuang 1 liter air atau secukupnya dalam wadah."+
                    "\n11. Masukkan potongan ayam dan bawang putih dalam wadah dan godok selama kurang lebih setengah jam."+
                    "\n12. Masukkan kentang, tomat, wortel, daun seledri atau daun bawang."+
                    "\n13. Tambahkan 1 sdm garam, ½ sdt merica, ½ sdm penyedap rasa (jika diinginkan)."+
                    "\n14. Biarkan hingga kentang dan wortel menjadi empuk."+
                    "\n15. Tuang isi dan kuah sop ayam dalam mangkok."+
                    "\n16. Tambahkan bawang goreng jika perlu." +
                    "\n17. Sajikan.");

        listResep.add(resep4);
        resep5.setJudul("Nasi Gudeg");
        resep5.setPoster("http://gudegyudjumpusat.com/wp-content/uploads/2015/12/Nasi-Gudeg-Ayam-Paha-Atas-Kecil.jpg");
        resep5.setSummary("Nasi Gudeg adalah makanan khas yang berasal dari kota kraton Yogyakarta.");
        resep5.setDetail(
                    "Bahan Bahan :"+
                    "\n1 kilogram Nangka muda di potong potong"+
                    "\n200 gram gula merah di sisir"+
                    "\nSantan kelapa kental"+
                    "\n10 butir telur di rebus"+
                    "\nDaun salam 2 atau 3 lembar"+
                    "\n1 liter air kelapa"+
                    "\nLengkuas potong memanjang"+

                    "\n\nBumbu Halus"+

                    "\nBawang merah 15 siung"+
                    "\nBawang putih 10 siung"+
                    "\nKemiri 10 buah disangrai"+
                    "\nKetumbar 2 sendok teh"+
                    "\nSatu setengah sendok teh merica"+
                    "\nGaram"+

                    "\n\nLangkah :"+
                    "\n1. Cuci buah nangka dengan bersih"+
                    "\n2. Sediakan Kuali (kendil) untuk memasak, masukan daun salam kemudian lengkuas dan masukan pula nangka, telur rebus serta gula aren"+
                    "\n3. Masukan air kelapa setengahnya saja kemudian masukan bumbu yang sudah dihaluskan aduk hingga tercampur rata"+
                    "\n4. Masukan setengah lagi air kelapa ke dalam panci hingga buah nangka terendam. Kemudian masak"+
                    "\n5. Masak bahan bahan dengan panci tertutup selama sekitar dua jam. Jika airnya sudah berkurang bahkan habis pisahkan telur rebusnya"+
                    "\n6. Santan dituangkan sambil nangkanya diaduk aduk."+
                    "\n7. Telur rebus dimasukkan kembali hingga terendam bersama dengan nangka"+
                    "\n8. Masak bahan bahan dengan api kecil kurang lebih empat jam. Biarkan hingga berubah kecoklatan dan kuahnya habis."
        );
        listResep.add(resep5);

        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
