package com.example.togaku.model;

import com.example.togaku.R;

import java.util.ArrayList;

public class TogaData {
   private static String[] togaNames = {
            "Cincau", "Jahe","Kencur","Andong","Kumis Kucing",
            "Kunyit","Lidah Buaya","Pukul Empat","Seledri","Sirih"
    };

    private static String[] togaDetails ={
            "1. Anti Demam\n" +
                    "2. Menurunkan Tekanan Darah\n" +
                    "3. Anti Racun\n" +
                    "Khasiat Tanaman Cincau :\n" +
                    "1. Mengobati Darah Tinggi\n" +
                    "2. Mengobati Alergi Makan Udang\n" +
                    "3. Mengobati Demam\n" +
                    "4. Mengobati Sakit Perut\n" +
                    "5. Mengobati Radang Pada Lambung\n" +
                    "6. Mengobati Penyakit-Penyakit Pada Usus\n" +
                    "7. Mengobati Typhus","1. Mengobati Rematik\n" +
            "Siapkan 1 atau 2 buah rimpang jahe, Panaskan rimpang tersebut diatas api atau bara kemudian ditumbuk. Tempel tumbukan jahe pada bagian tubuh yang sakit rematik. \n" +
            "2. Mengobati Luka Lecet, Ditikam Benda Tajam, Terkena Duri, Jatuh, Digigit Ular\n" +
            "Rimpang jahe merah ditumbuk dan ditambahkan sedikit garam, letakkan pada bagian tubuh yang luka.\n" +
            "3. Mengobati Eksim\n" +
            "Parutlah lobak, lalu campurlah dengan air jahe. Air jahe dapat diperoleh dengan memarut rimpang jahe, lalu diperas. Ramuan ini dioleskan ke bagian kulit yang terkena eksim. Biasanya dalam waktu 2 minggu saja penyakit sudah berkurang.\n" +
            "4. Mengobati Syaraf Muka Yang Sakit\n" +
            "Bahan terdiri campuran kentang, tepung terigu, dan jahe. Caranya kentang diparut kemudian tambahkan tepung terigu dan bubuk jahe. Tambahkan sedikit air hangat, tempelkan pada bagian muka yang sakit. Lakukan hingga penyakit sembuh.\n",
            "1. Mengobati Tetanus\n" +
                    "Siapkan rimpang kencur sebesar 3 jari, tambahkan daun jinten setengah genggam dan daun ngokilo 18 lembar. Cuci bersi ramuan dan potong-potong seperlunya, rebuslah dengan 3 gelas air bersih. Tambahkan 3 jari gula enau, biarkan air rebusan hingga 3/4 gelas. Sebaiknya ramuan ini diminum 3X sehari.\n" +
                    "2. Mengobati Muntah-Muntah\n" +
                    "Siapkan 1,5  jari kencur, cuci bersih lalu dikunyah bersama sedikit garam. Sesudah dikunyah halus kemudian kencur ditelan dan kemudian minum air hangat. Lakukan 2X sehari.\n" +
                    "3. Mengobati Keracunan Jamur\n" +
                    "Ambillah rimpang kencur 1 jari, daun sambiloto 1/3 genggam, dan daun jinten 1/4 genggam untuk mengobatinya. Tumbuk dan tambahkan air masak 3/4 gelas, kemudian peras dan saringlah, lantas diminum. Cukup diminum sekali sehari.\n",
    "1. Mengobati TBC Paru Dengan Batuk Berdarah\n" +
            "Daun kering 15-30 gram, atau bunga kering 9-15 gram atau akar kering 6-10 gram direbus dan diminum.\n" +
            "2. Ancaman Keguguran Kandungan, Menstruasi Yang Banyak, Air Kemih Berdarah dan Wasir Berdarah\n" +
            "Daun kering 15-30 gram, atau bunga kering 9-15 gram, atau akar kering 6-10 gram direbus dan diminum.\n" +
            "3. Mengobati Nyeri Lambung dan Mengobati Nyeri Ulu Hati\n" +
            "Daun 15-30 gram, atau bunga 9-15 gram, atau akar kering 6-10 gram direbus dan diminum.\n" +
            "4. Mengobati Air Kemih Berdarah dan Mengobati Tidak Menstruasi\n" +
            "Daun segar 60-100 gram atau akar 30-60 gram direbus dan diminum\n" +
            "5. Mengobati Radang Gusi\n" +
            "Kulit dikikis, diberi garam sedikit dan dioleskan pada tempat yang sakit\n",
            "1. Mengobati Infeksi Saluran Kencing atau Sering Kencing (Anyang-anyangan)\n" +
                    "Petiklah tangkai dan daun kumis kucing sebanyak 30 gram, tambahkan daun meniran dan Commelia communis masing-masing 30 gram, rebus dan minumlah.\n" +
                    "2. Mengobati Kencing Yang Tersendat dan Disertai Rasa Sakit\n" +
                    "Daun kumis kucing yang dikeringkan dapat diseduh seperti teh, lalu diminum dengan gula aren. \n" +
                    "3. Mengobati Darah Tinggi\n" +
                    "Siapkan daun kumis kucing yang basah dan kering sebanyak 50 gram, daun kumis kucing yang kering dibersihkan lalu di rebus dengan air secukupnya. Daun yang segar langsung di seduh dengan air panas. Hasil ramuan keduanya diambil lalu disaring, ramuan ini sebaiknya diminum segelas sehari.\n" +
                    "4. Mengobati Demam\n" +
                    "Siapkan 100 gram akar kumis kucing, cuci hingga bersih, selanjutnya rebus dengan air sebanyak 2000 cc. Setelah mendidih diamkan air sampai tidak terlalu panas, kemudian saring dan ambil airnya. Air rebusan ini cukup diminum segelas sehari.\n" +
                    "5. Khasiat Yang Lain\n" +
                    "Semua bagian tanaman kumis kucing dapat pula direbus atau dikeringkan, lantas diseduh seperti minum teh. Berguna untuk menyembuhkan infeksi ginjal, menyembuhkan kencing batu, menambah nafsu makan, menghilangkan panas dan mengobati encok.\n",
    "1. Mengobati Disentri\n" +
            "Rimpang kunyit sebanyak 1-2 buah direbus dengan 2 gelas air bersama gambir dan kapur sirih secukupnya. Perebusan dilakukan hingga tinggal 1 gelas, lalu disaring dan airnya diminum.\n" +
            "2. Mengobati Haid Yang Tidak Lancar\n" +
            "Dua buah rimpang kunyit, 1/2 sendok ketumbar, 1/2 sendok biji pala, dan 1/2 genggam daun sri gading ditumbuk hingga halus. Tambahkan air 1 liter dan rebuslah hingga mendidih, airnya lalu disaring dan diminum segelas sehari. \n" +
            "3. Mengobati Amandel\n" +
            "Ambillah 1-2 rimpang kunyit, 1 butir jeruk nipis, dan 2 sendok madu. Rimpang kunyit diparut, jeruk diperas dan diambil airnya. Campurkan bahan tersebut dengan madu dan 1/2 gelas air hangat. Aduk dan saringlah sebelum diminum secara rutin 2X sehari.\n" +
            "4. Menghilangkan Ketombe\n" +
            "Tumbuk rimpang kunyit yang agak besar, setelah keluar airnya, gosokkan atau pijat sarinya agar mengenai kulit kepala. Biarkan sari kunyit ini mengendap dikulit kepala semalam atau paling tidak beberapa jam. Setelah itu, cuci rrambut hingga bersih.\n" +
            "5. Mengobati Bengkak Digigit Serangga atau Terkena Ulat Bulu\n" +
            "Parutlah 2-3 rimpang kunyit, tambahkan 1/4 sendok makan kapur sirih dan dicampur merata. Oleskan atau tempelkan bahan tersebut pada bagian yang terkena.\n",
            "1. Penyubur Rambut\n" +
                    "Ambillah daun lidah buaya segar secukupnya dan dibelah. Ambil daging yang seperti agar-agar dan digosok-gosokkan dikulit kepala. Selanjutnya rambut dibungkus dengan kain dan biarkan beberapa saat agar meresap ke kulit kepala sebelum dicuci.\n" +
                    "2. Mengobati Rambut Yang Mudah Rontok\n" +
                    "Siapkan daun lidah buaya 40 gr, daun mangkokan 20 gr, daun waru muda 20 gr, dan minyak kemiri 50 ml. Tumbuk semua daun tersebut dengan minyak kemiri. Ramuan ini ditempelkan di kulit kepala. Biarkan beberapa saat (lebih lama lebih baik) sebelum dicuci.\n" +
                    "3. Mengobati Luka Bakar dan Tersiram Air Panas yang Ringan\n" +
                    "Tempelkan daging daun lidah buaya ke bagian tubuh yang sakit.\n" +
                    "4. Mengobati Bisul\n" +
                    "Daging daun lidah buaya ditambah garam dan ditempelkan pada bisul.\n" +
                    "5. Mengobati Kencing Darah\n" +
                    "Petik 15 gr daun lidah buaya segar, peras dan ambil airnya, tambahkan 30 gr gula dan sedikit air beras sebelum diminum.\n" +
                    "6. Mengobati Wasir\n" +
                    "Siapkan 1/2 daun lidah buaya, buang durinya lalu cuci bersih. Parut daun tersebut dan tambahkan 1/2 cangkir air matang dan 2 sendok makan madu. Aduk rata campuran tersebut, lalu disaring. Dengan minum ramuan ini sehari 3X diharapkan wasir segera sembuh.\n" +
                    "7. Mengobati Siphylis\n" +
                    "Potonglah bunga lidah buaya, rebus dengan daging dan sedikit air. Air rebusan lalu diminum.\n",
            "Dapat mengobati :\n" +
                    "    Radang prostat\n" +
                    "    Bisul\n" +
                    "    Acute arthritis\n" +
                    "    Jerawat\n" +
                    "    Radang amandel (tonsilitis)\n" +
                    "    Radang tenggorokan (pharyngitis)\n" +
                    "    Batuk berdarah (hemoptysis)\n" +
                    "    Infeksi saluran air seni (genito-urinary tract infection)\n" +
                    "    Air seni mengandung lemak (chyluria)\n" +
                    "    Batu ginjal,\n" +
                    "    Batu empedu\n" +
                    "    Kencing manis (diabetes millitus)\n" +
                    "    Radang kelenjar prostat (prostatitis)\n" +
                    "    Keputihan (leucorrhoea)\n" +
                    "    Radang sendi yang akut (acute arthritis)\n" +
                    "    Eksim (ekzema)\n" +
                    "    Koreng,\n" +
                    "    luka terpukul\n" +
                    "    Kanker\n" +
                    "    Tukak lambung\n" +
                    "    Pembekuan darah\n" +
                    "    dan lain-lain.\n",
            "Secara tradisional tanaman seledri diguanakan sebagai pemacu enzim pencernaan atau sebagai penambah nafsu makan, peluruh air seni, dan penurun tekanan darah. Di samping itu digunakan pula untuk memperlancar keluarya air seni, mengurangi rasa sakit pada rematik dan gout, juga digenakan sebagai anti kejang. Selebihnya daun dan batang seledri digunakan sebagai sayur dan lalap untuk penyedap masakan.",
            "1. Menghilangkan Bau Badan\n" +
                    "Rebuslah 5 lembar daun sirih segar dengan 2 gelas air. Perebusan dilakukan hingga airnya tinggal satu gelas. Air ini diminum siang hari.\n" +
                    "2. Mengobati Mimisan\n" +
                    "Ambillah 1 lembar daun sirih segar yang agak muda, cuci hingga bersih. Daun ditekuk, lalu tekukannya digulung sebesar lubang hidung. Lalu gulungan daun sirih tersebut dimasukkan kedalam lubang hidung yang berdarah. Lakukan hingga darah berhenti mengalir. Usahakan penderita tetap duduk tegak agar darah tidak mengalir ke belakang rongga hidung.\n" +
                    "3. Pembersih Mata yang Gatal atau Merah.\n" +
                    "Rebuslah 5-6 lembar daun sirih muda yang baru dipetik dengan 1 gelas air. Setelah mendidih air di dinginkan. Basuh mata dengan air rebusan tadi sehari 3 kali.\n" +
                    "4. Mengobati Koreng atau Gatal-Gatal.\n" +
                    "Ambil 20 lembar daun sirih yang cukup tua. Rebus dengan air sekitar 3-4 gelas. Gunakan air rebusan yang masih hangat untuk mencuci bagian tubuh yang terkena koreng dan gatal.\n" +
                    "5. Mengobati Sariawan.\n" +
                    "Petiklah 1 atau 2 lembar daun sirih, bersihkan lalu kunyah daun tersebut hingga lumat. Biarkan sebentar di dalam mulut, terutama dibagian yang terkena sariawan.\n" +
                    "6. Khasiat Lain\n" +
                    "Air rebusan sirih juga dipercaya dapat menghilangkan bau mulut, gunakan untuk kumur-kumur. Selain itu, dapat juga mengurangi jerawat apabila dibasuhkan ke muka. Daun sirih yang dimakan dengan pinang dan kapur juga diyakini mampu menguatkan gigi agar tidak mudah tanggal.\n"};

    private static int[] togaImages = {
            R.drawable.cincau,
            R.drawable.jahe,
            R.drawable.kencur,
            R.drawable.andong,
            R.drawable.kumis,
            R.drawable.kunyit,
            R.drawable.lidah,
            R.drawable.empat,
            R.drawable.seledri,
            R.drawable.sirih
    };

    public static ArrayList <Toga> getListData(){
        ArrayList<Toga> list = new ArrayList<>();
        for (int position = 0; position < togaNames.length; position++) {
            Toga toga = new Toga();
            toga.setName(togaNames[position]);
            toga.setDetail(togaDetails[position]);
            toga.setPhoto(togaImages[position]);
            list.add(toga);
        }
        return list;
    }
}















