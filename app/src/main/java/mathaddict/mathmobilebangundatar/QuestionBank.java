package mathaddict.mathmobilebangundatar;

/**
 * Created by Wa2n on 04/07/2017.
 */

public class QuestionBank {

    // array of questions
    private String textQuestions [] = {
            "1.Pernyataan berikut yang benar, kecuali ... ",
            "2.Pernyataan yang salah .... ",
            "3.Diantara segitiga segitiga berikut, yang memiliki tepat satu sumbu simetri adalah ... ",
            "4.Sebuah segitiga memiliki sudut-sudut ( satuan derajat ), \n" +
                    " 50 ,80, 50 termasuk dalam segitiga apakah segitiga tersebut ...\n ",
            "5.Diketahui segitiga KLM adalah segitga sembarang, sudut K adalah 4x derajat, sudut L adalah 5x derajat, dan sudut M adalah 3x derajat. Sudut terbesar dalam segitiga KLM adalah .... ( satuan derajat ).",
            "6.Pada segitiga ABC, sudut ABC = 40 derajat, sudut BAC = 70 derajat. Maka besar sudut ACB adalah .... ( satuan derajat )",
            "7.Diketahui segitiga ABC , dengan siku siku di B, titik D pada sisi AC. BD adalah garis tinggi. Panjang BC = 8 cm, panjang BA = 6 cm, dan panjang DC = 10 cm. Tentukanlah luas segitiga ABC ! ( satuan cm persegi )",
            "8.Jika alas segitiga = a, tinggi = t dan luas segitiga = L, maka hubungan a, t dan Ldi bawah ini yang tidak benar adalah ...",
            "9.luas sebuah segitiga adalah 48 cm2. Jika alas segitiga adalah 8 cm, maka tinggi segitiga tersebut adalah ...",
            "10.Suatu segitiga, panjang alas = ( x-2 ) cm dan tingginya = 8 cm.jika luas setiga tersebut adalah 104 cm persegi maka panjang alasnya adalah...",
            "11.Dari ketiga bilangan dibawah ini yang merupakan suatu tripel pythagoras adalah...",
            "12.Besar sudut-sudut segitiga mempunyai perbandingan 3:2:4, besar ketiga sudut tersebut adalah ... ( satuan derajat )",
            "13.Keliling segitiga PQR adalah 120 cm. Jika PQ : QR:PR = 3:4:5. Maka panjang PQ =",
            "14.Sebuah segitiga PQR dengan siku-siku di Q, PQ = 8cm, dan PR = 17 cm. Panjang QR adalah ...",
            "15.Diketahui segitiga ABC, DE sejajar AC. AD = 6 cm, DE = 10 cm, dan AC = 15 cm. Panjang BD = ....",
            "16.Persegi panjang memiliki sumbu simetri…",
            "17.Diketahui panjang diagonal persegi panjang adalah 26 cm, dan panjang salah satu sisinya adalah 10 cm. Panjang sisi yang lain adalah ...",
            "18.Sebuah persegi panjang ABCD dengan panjang AB = ( 5x + 3) cm, dan lebar 7 cm, bila luasnya samadengan 196 cm persegi, maka kelilingnya adalah ... ",
            "19.Suatu persegi dengan keliling 48 cm. Maka luas persegi tersebut adalah ... ( cm persegi )",
            "20.Titik A (2,8), B (-2,8), C (-2,4) tentukan titik d apabila ABCD adalah persegi.",
            "21.Pajang diagonal belah ketupat 16cm dan 12cm, keliling belah ketupat adalah...",
            "22.Luas belah ketupat adalah 144cm persegi jika salah satu diagonalnya adalah 12cm maka panjang diagonal yang lain adalah…",
            "23.Jika luas belah ketupat adalah 150 cm2 dan salah satu diagonalnya adalah 25 cm maka panjang diagonal lainnya adalah ...",
            "24.Keliling layang – layang 100 cm, apabila perbandingan sisi pendek dengan sisi panjang = 2:3, maka panjang sisi pendek dan sisi panajngnya masing – masing adalah...",
            "25.Luas layang layang yang panjang diagonalnya 8 cm dan 10 cm adalah ...( dalam cm persegi) ",
            "26.Panajng diagonal diagonal layang layang ABCD ialah AC = 8, dan BD = (x+1) cm. Jika luas layang layang itu 48 cm persegi maka nilai BD = ....",
            "27.Diketahu sebuah trapesium ABCD adalah trapesium sama kaki, dan AB sejajar CD,\n" +
                    "Panajang AB = 19 cm dan CD = 7 cm. Panjang salah satu akkinya adalah 10 cm.\n" +
                    "Maka luas trapesium tersebut adalah ... ( satuan cm persegi )\n",
            "28.Pernyataan berikut yang benar , kecuali ...",
            "29.Pernyataan berikut ini yang merupakan sifat trapesium adalah,kecuali ...",
            "30.Luas kebun pak Harjo 40m x 20m. Akan ditanami pohon jati dengan jarak antar pohon 4m. Berapa banyak pohon jati yang bisa ditanam pak Harjo…."

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Segitiga sama kaki mempunyai 3 sumbu simetri",
                    "Segitiga sama sisi mempunya 3 sumbu simetri",
                    "Segitiga sama kaki menempati bingkainya dengan 3 cara",
                    "Segitiga sama sisi menempati bingkainya dengan 6 cara"},
            {"Segitiga tumpul adalah segitiga yang semua sudutnya lebih dari 90 derajat.",
                    "Segitiga lancip adalah segitiga yang semua sudutnya kurang dari 90 derajat",
                    "Segitiga siku-siku adalah segitiga yang salah satu sudutnya 90 derajat",
                    "Segitiga sama kaki adalah segitiga yang mempunya dua sisi yang sama"},
            {"Segitga tumpul",
                    "Segitiga sama kaki",
                    "Segitiga siku siku",
                    "Segitiga sama sisi"},
            {"segitiga tumpul",
                    "segitiga tumpul sama kaki",
                    "Segitiga lancip",
                    "segitiga lancip sama kaki"},
            {"85","80", "75","70"},
            {"40", "50", "60","70"},
            {"12","24", "30","40"},
            {"L = ½ × a × t",
                    "t = L/a",
                    "a = 2L/t",
                    "t = 2L/a"},
            {"3cm","12cm","24cm","26cm"},
            {"11cm","13cm","24cm","26cm"},
            {"2,6,9","4,8,12","20,10,30","21,28,35"},
            {"\t60, 40, 80\n",
                    "\t40, 60, 80 \n",
                    "\t80, 60, 40\n",
                    "\t40,80, 60\n"},
            {"\t36 cm\n",
                    "\t30 cm\n",
                    "\t12 cm\n",
                    "\t10 cm\n"},
            {"\t9 cm\n",
                    "\t15 cm\n",
                    "\t25 cm\n",
                    "\t68 cm\n"},
             {"\t9 cm\n",
                    "\t10 cm\n" ,
                    "\t12 cm\n" ,
                    "\t15 cm\n"},
            {"\t2\n",
                    "\t4\n",
                    "\t8\n",
                    "\t16\n"},
            {"\t16 cm\n",
                    "\t22 cm \n",
                    "\t18 cm\n",
                    "\t24 cm\n"},
            {"\t34 cm\n",
                    "\t35 cm\n",
                    "\t68 cm\n",
                    "\t70 cm\n"},
            {"\t36 \n",
                    "\t144\n",
                    "\t81\n",
                    "\t64\n"},
            {"\t (2,4).\n",
                    "\t(-2,2)\n",
                    "\t(-8,8)\n",
                    "\t(-2,4)\n"},
            {"\t28\n",
                    "\t56\n",
                    "\t40\n",
                    "\t80\n"},
            {"\t24\n",
                    "\t12\n",
                    "\t6\n",
                    "\t3\n"},
            {"\t20 cm\n",
                    "\t12 cm\n",
                    "\t18 cm\n",
                    "\t22 cm\n"},
            {"\t40 cm dan 60 cm\n",
                    "\t30 cm dan 45 cm\n",
                    "\t20 cm dan 30 cm\n",
                    "\t10 cm dan 15 cm\n"},
            {"\t40\n",
                    "\t60\n",
                    "\t48\n",
                    "\t80\n"},
            {"\t13 cm\n",
                    "\t12 cm\n",
                    "\t7 cm\n",
                    "\t5 cm\n"},
            {"\t104\n",
                    "\t152\n",
                    "\t208\n",
                    "\t260\n"},
            {"\tMenghitung luas layang- layang dapat menggunakan rumus luas jajargenjang\n" ,
                    "\tMenghitung luas persegi panjang dapat menggunakan rumus luas jajargenjang\n",
                    "\tMenghitung luas jajargenjang dapat menggunakan rumus luas trapesium\n",
                    "\tMenghitung luas persegi dapat menggunakan rumus belah ketupat.\n"},
            {"\tPada trapesium siku-siku, terdapat sebuat sudut siku siku\n",
                    "\tPada trapesium sama kaki, terdapat 2 buah diagonal yang sama panajang.\n",
                    "\tPada setiap trapesium, jumlah tiap pasangan sudut dalam sepihak pada sisi yang sejajar adalah 90 derajat.\n",
                    "\tPada trapesium sama kaki, sudut-sudut dalam sepihak tidak sama besar.\n"},
            {"80\n",
                    "70\n",
                    "50\n",
                    "800\n"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            "Segitiga sama kaki mempunyai 3 sumbu simetri",
            "Segitiga tumpul adalah segitiga yang semua sudutnya lebih dari 90 derajat.",
            "Segitiga sama kaki",
            "segitiga tumpul sama kaki",
            "75",
            "70",
            "24",
            "\tt = L/a",
            "12cm",
            "26cm",
            "21,28,35",
            "\t60, 40, 80\n",
            "\t30 cm\n",
            "\t15 cm\n",
            "\t12 cm\n",
            "\t2\n",
            "\t24 cm\n",
            "\t70 cm\n",
            "\t144\n",
            "\t (2,4).\n",
            "\t40\n",
            "\t24\n",
            "\t12 cm\n",
            "\t20 cm dan 30 cm\n",
            "\t40\n",
            "\t12 cm\n",
            "\t104\n",
            "\tMenghitung luas layang- layang dapat menggunakan rumus luas jajargenjang\n",
            "\tPada setiap trapesium, jumlah tiap pasangan sudut dalam sepihak pada sisi yang sejajar adalah 90 derajat.\n",
            "50\n"






    };

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}