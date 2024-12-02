package com.example.bangkittugas2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var atlitAdapter: AtlitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val atlitList = listOf(
            Atlit("Rafael", R.drawable.rafel, "Putra Lompat Tinggi" +
                    "Rafael adalah atlet lompat tinggi putra asal DKI Jakarta yang meraih medali emas dan memecahkan rekor nasional pada PON XXI Aceh-Sumut 2024: \n" +
                    "Rafael\n" +
                    "Prestasi\n" +
                    "Medali emas dan rekor nasional lompat tinggi dengan tinggi lompatan 2,16 meter\n" +
                    "Tempat pertandingan\n" +
                    "Stadion Madya Atletik Sumut Sport Center, Deli Serdang, Sumatera Utara\n" +
                    "Tanggal pertandingan\n" +
                    "Jumat, 13 September 2024\n" +
                    "Selain Rafael, atlet lain yang meraih medali pada final lompat tinggi putra PON XXI Aceh-Sumut 2024 adalah:\n" +
                    "M Hariadi dari DKI Jakarta, meraih medali perak dengan tinggi lompatan 2,08 meter\n" +
                    "I Made Gede dari Bali, meraih medali perunggu dengan tinggi lompatan 2,04 meter" +
                    "Isan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("Idan Fauzan Richsan", R.drawable.idan, "Putra Lompat Tinggi Galah\n" +
                    "Isan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("Nella Agustin", R.drawable.nella, "Putri Lari 200 Meter\nIsan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("Dina Aulia", R.drawable.dina, "Putri Lari Gawang 100 Meter\nIsan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("Atinna Nurkamila Intan", R.drawable.atinna, "Putri Lempar Lembing\nIsan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("Diva Renatta Jayadi", R.drawable.diva, "Putri Lompat Tinggi Galah\nIsan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("Lalu Muhammad Zohri", R.drawable.zohri, "Putra Lari 200 Meter\nIsan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("Wahyudi Putra", R.drawable.wahyudi, "Putra Lari 1.500 Meter\nIsan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("M.Syahrial Bakti", R.drawable.syahrial, "Putra Tolak Peluru\nIsan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter."),
            Atlit("Tresna Puspita Gus", R.drawable.tresna, "Putri Lontar Martil\nIsan Fausan Ricksan, atlet lompat galah putra Indonesia mampu meraih medali perak di Kejuaraan Atletik Asia Junior 2018 yang berlangsung di Gifu, Jepang, yang berlangsung mulai Kamis (7/6) hingga Minggu (10/6) nanti.\n" +
                    "\n" +
                    "Idan Fauzan yang merupakan pemegang rekor nasional lompat galah putra junior pada hari pertama Kejuaraan Atletik Asia Junior ke-18 ini, Kamis (7/6) petang mampu meraih medali perak setelah lompatan terbaiknya mencapai 5,15 meter.\n" +
                    "\n" +
                    "Lompatan tersebut masih dibawah lompatan terbaiknya yang sekaligus menjadi rekor nasional lompat galah putra junior Indonesia yang sudah mencapai 5,20 meter yang diciptakan pada akhir tahun lalu di Stadion Atletik Rawamangun, Jakarta.\n" +
                    "\n" +
                    "Peraih medali emas nomor ini yakni Syunto Ozaki yang merupakan salah satu andalan tuan rumah. Ozaki mampu melewat mintar setinggi 5,20 meter.\n" +
                    "\n" +
                    "Tentu masih jauh dari rekor Asia junior yang sudah dicapai Masaki Ejima yang dibuat 6 Juli 2017 lalu juga di Kejuaraan Atletik Asia Junior di Bhubaneswar, India. Di mana saat itu Ejima sudah mampu melampaui mistar setinggi 5,65 meter.\n" +
                    "\n" +
                    "Sedangkan medali perunggunya diraih Kasinpob Chomchanad dari Negeri Gajah Putih, Thailand. Chomchanad melakukan lomptan setinggi 5,00 meter saja.\n" +
                    "\n" +
                    "Kazuya Ishibashi juga dari Jepang harus puas di posisi ke empat setelah lompatan terbaiknya mencapai 5,00 meter. Tentu lompatan tersebut dicapai setelah Chomchanad mampu melampauinya lebih dulu. Makanya Ishibashi harus puas di empat besar.\n" +
                    "\n" +
                    "Sedangkan atlet Indonesia lainnya, Dedi Irawan yang menjadi salah satu pesaing Idan Fauzan, hanya bisa mencapai urutan ke lima dari delapan peserta nomor lompat galah putra ini. Setelah lompatan terbaiknya mencapai 4,90 meter.\n" +
                    "\n" +
                    "Ketiga peserta lainnya masing-masing di posisi ke enam, tujuh dan juru kunci. Yakni Yusuke Ishikawa dari Jepang dengan lompatan yang mencapai 4,90 meter setelah lebih dulu dilewati Dedi. Kemudian Yong-Fu Huang dari Taiwan (4,80 meter) serta Chuanguang Huang dari China (4,65 meter).\n" +
                    "\n" +
                    "Seperti diketahui Pengurus Besar Persatuan Atletik Seluruh Indonesia (PB PASI) menurunkan 6 atlet putra dan 2 atlet putri ke Kejuaraan Atletik Asia Junior 2018 ini.\n" +
                    "\n" +
                    "Keenam atlet lainnya yakni Lalu Muhammad Zohri yang akan turun pada nomor 100 meter, Bakti Ladia Mukhtar pada 100 meter dan 200 meter, Halomoan Edwin Binsar turun di lari gawang 400 meter,  Rafika Putra untuk lontar martil, Jeany Nuraini Agreta pada 100 meter dan Marselina Tamu Apu di 400 meter.")
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        atlitAdapter = AtlitAdapter(atlitList) { atlit ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("title", atlit.title)
                putExtra("imageRes", atlit.imageRes)
                putExtra("description", atlit.description)
            }
            startActivity(intent)
        }

        recyclerView.adapter = atlitAdapter
    }

    // Menambahkan menu ke toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Menangani klik pada item menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_page -> {
                // Ketika "About" diklik, navigasi ke AboutActivity
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
