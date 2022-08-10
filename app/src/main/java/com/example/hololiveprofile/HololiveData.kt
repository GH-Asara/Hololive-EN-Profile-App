package com.example.hololiveprofile

object HololiveData {
    private val heroNames = arrayOf(
        "Mori Calliope",
        "Takanashi Kiara",
        "Ninomae Ina'nis",
        "Gawr Gura",
        "Watson Amelia",
        "IRyS",
        "Ceres Fauna",
        "Ouro Kronii",
        "Nanashi Mumei",
        "Hakos Baelz",
        "Tsukumo Sana",
        "Omegaα",
        "Motoaki Tanigo",
        "Yuujin A",
        "Harusaki Nodoka"
    )

    private val heroDetails = arrayOf(
        "Mori Calliope is an English Virtual YouTuber associated with hololive, debuting as part of its English (EN) branch first generation of VTubers alongside Ninomae Ina'nis, Takanashi Kiara, Watson Amelia and Gawr Gura.",
        "Takanashi Kiara (小鳥遊キアラ) is an English Virtual YouTuber associated with hololive, debuting as part of its English (EN) branch first generation of VTubers alongside Ninomae Ina'nis, Watson Amelia, Mori Calliope and Gawr Gura.",
        "Ninomae Ina'nis is an English Virtual YouTuber associated with hololive, debuting as part of its English (EN) branch first generation of VTubers alongside Takanashi Kiara, Watson Amelia, Mori Calliope and Gawr Gura.",
        "Gawr Gura is an English Virtual YouTuber associated with hololive, debuting as part of its English (EN) branch first generation of VTubers alongside Ninomae Ina'nis, Takanashi Kiara, Watson Amelia and Mori Calliope.",
        "Watson Amelia is an English Virtual YouTuber associated with hololive, debuting as part of its English (EN) branch first generation of VTubers alongside Ninomae Ina'nis, Takanashi Kiara, Mori Calliope and Gawr Gura.",
        "IRyS is an English Virtual Singer associated with hololive as part of its English (EN) branch's \"Project: HOPE.\"",
        "Ceres Fauna (セレス・ファウナ) is an English-language Virtual YouTuber associated with hololive. She debuted in 2021 as part of hololive -Council-, the second generation of members of hololive English, alongside Tsukumo Sana, Ouro Kronii, Nanashi Mumei and Hakos Baelz.",
        "Ouro Kronii (オーロ・クロニー) is an English-language Virtual YouTuber associated with hololive. She debuted in 2021 as part of hololive -Council-, the second generation of members of hololive English, alongside Tsukumo Sana, Ceres Fauna, Nanashi Mumei and Hakos Baelz.",
        "Nanashi Mumei (七詩ムメイ) is an English-language Virtual YouTuber associated with hololive. She debuted in 2021 as part of hololive -Council-, the second generation of members of hololive English, alongside Tsukumo Sana, Ceres Fauna, Ouro Kronii and Hakos Baelz.",
        "Hakos Baelz (ハコス・ベールズ) is an English speaking Virtual YouTuber associated with hololive. She debuted in 2021 as part of hololive -Council-, the second generation of members of hololive English, alongside Tsukumo Sana, Ceres Fauna, Ouro Kronii and Nanashi Mumei.",
        "Tsukumo Sana (九十九 佐命) was an English Virtual YouTuber associated with hololive. She debuted in 2021 as part of hololive -Council-, the second generation of members of hololive English, alongside Ceres Fauna, Ouro Kronii, Nanashi Mumei and Hakos Baelz.",
        "Omegaα (Omega Alpha) is a figure associated with hololive English. They were revealed during the hololive English -Council- debut collab in 2021. It is not yet known if or when they will debut as a VTuber or merely appear in a support role for hololive English.",
        "Motoaki Tanigo is the CEO of COVER Corporation. His nickname among the talents and many fans. The name YAGOO originated from one of Roboco's streams, where Subaru read \"Tanigo\" as \"Yagoo\".",
        "Yuujin A (友人A, Friend A), better known as A-chan (えーちゃん), is a female Japanese head content director, equipment technician and Virtual YouTuber associated with hololive. A-chan also serves as the narrator in most collaboration videos uploaded to hololive's Japanese channel. She used to be in charge of the technical aspects of Tokino Sora's live streams.",
        "Harusaki Nodoka (春先のどか) is a female staff member and virtual YouTuber associated with hololive."
    )

    private val heroesImages = intArrayOf(R.drawable.mori_calliope,
        R.drawable.takanashi_kiara,
        R.drawable.ninomae_inanis,
        R.drawable.gawr_gura,
        R.drawable.watson_amelia,
        R.drawable.irys,
        R.drawable.ceres_fauna,
        R.drawable.ouro_kronii,
        R.drawable.nanashi_mumei,
        R.drawable.hakos_baelz,
        R.drawable.tsukumo_sana,
        R.drawable.omegaalpha,
        R.drawable.motoaki_tanigo,
        R.drawable.a_chan,
        R.drawable.harusaki_nodoka
    )

    val listData: ArrayList<Hololive>
        get() {
            val list = arrayListOf<Hololive>()
            for (position in heroNames.indices) {
                val holo = Hololive()
                holo.name = heroNames[position]
                holo.detail = heroDetails[position]
                holo.photo = heroesImages[position]
                list.add(holo)
            }
            return list
        }
}