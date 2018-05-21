package com.kacau.kacaumap;

import android.graphics.Color;
import com.skt.Tmap.TMapPoint;
import com.skt.Tmap.TMapPolyLine;

public class Edges {

    NewLine newLine =new NewLine();
    N1N2 n1n2 =new N1N2();
    N2N3 n2n3 = new N2N3();
    N2N9 n2n9 = new N2N9();
    N3N4 n3n4 = new N3N4();
    N4N5 n4n5 = new N4N5();
    N4N43 n4n43 = new N4N43();
    N5N6 n5n6 = new N5N6();
    N6N7 n6n7 = new N6N7();
    N7N8 n7n8 = new N7N8();
    N8N9 n8n9 = new N8N9();
    N8N17 n8n17 = new N8N17();
    N9N10 n9n10 = new N9N10();
    N10N11 n10n11 = new N10N11();
    N11N12 n11n12 = new N11N12();
    N12N13 n12n13 = new N12N13();
    N12N14 n12n14 = new N12N14();
    N13N15 n13n15 = new N13N15();
    N13N16 n13n16 = new N13N16();
    N15N20 n15n20 = new N15N20();
    N16N17 n16n17 = new N16N17();
    N16N18 n16n18 = new N16N18();
    N18N19 n18n19 = new N18N19();
    N18N43 n18n43 = new N18N43();
    N19N20 n19n20 = new N19N20();
    N19N22 n19n22 = new N19N22();
    N19N41 n19n41 = new N19N41();
    N20N21 n20n21 = new N20N21();
    N21N22 n21n22 = new N21N22();
    N21N38 n21n38 = new N21N38();
    N22N23 n22n23 = new N22N23();
    N23N24 n23n24 = new N23N24();
    N23N34 n23n34 = new N23N34();
    N23N38 n23n38 = new N23N38();
    N24N25 n24n25 = new N24N25();
    N25N26 n25n26 = new N25N26();
    N26N27 n26n27 = new N26N27();
    N27N28 n27n28 = new N27N28();
    N27N30 n27n30 = new N27N30();
    N28N29 n28n29 = new N28N29();
    N30N31 n30n31 = new N30N31();
    N31N32 n31n32 = new N31N32();
    N32N33 n32n33 = new N32N33();
    N32N34 n32n34 = new N32N34();
    N33N35 n33n35 = new N33N35();
    N34N37 n34n37 = new N34N37();
    N35N36 n35n36 = new N35N36();
    N35N39 n35n39 = new N35N39();
    N36N37 n36n37 = new N36N37();
    N37N42 n37n42 = new N37N42();
    N39N40 n39n40 = new N39N40();
    N39N43 n39n43 = new N39N43();
    N40N41 n40n41 = new N40N41();
    N41N42 n41n42 = new N41N42();
    N3N44 n3n44 = new N3N44();
    N5N45 n5n45=new N5N45();
    N6N46 n6n46=new N6N46();
    N7N47 n7n47=new N7N47();
    N10N48 n10n48=new N10N48();
    N10N49 n10n49=new N10N49();
    N11N50 n11n50=new N11N50();
    N15N51 n15n51=new N15N51();
    N40N52 n40n52=new N40N52();
    N24N53 n24n53=new N24N53();
    N25N54 n25n54=new N25N54();
    N26N55 n26n55=new N26N55();
    N28N56 n28n56=new N28N56();
    N42N57 n42n57=new N42N57();
    N17N58 n17n58=new N17N58();



    public class NewLine {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public NewLine(){
        }

        public void drawLine(String L1Latitude,String L1Longitude,String L2Latitude,String L2Longitude){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(Double.parseDouble(L1Latitude),Double.parseDouble(L1Longitude));
            tMapPoint2 = new TMapPoint(Double.parseDouble(L2Latitude),Double.parseDouble(L2Longitude));
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }

    public class N1N2 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;
        TMapPoint tMapPoint3= null;

        public N1N2(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.506162,126.955047);
            tMapPoint2 = new TMapPoint(37.506234, 126.954642);
            tMapPoint3 = new TMapPoint(37.505008,126.953873);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
        }

    }
    public class N2N3 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N2N3(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505008,126.953873);
            tMapPoint2 = new TMapPoint(37.50489,126.954118);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N2N9 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;
        TMapPoint tMapPoint3= null;
        TMapPoint tMapPoint4= null;
        TMapPoint tMapPoint5= null;
        TMapPoint tMapPoint6= null;

        public N2N9(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505008,126.953873);
            tMapPoint2 = new TMapPoint(37.504779,126.954217);
            tMapPoint3 = new TMapPoint( 37.504481, 126.954099);
            tMapPoint4 = new TMapPoint(  37.504324, 126.954121);
            tMapPoint5 = new TMapPoint(  37.504013, 126.954829);
            tMapPoint6 = new TMapPoint(37.503813,126.955561);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
            tMapPolyLine.addLinePoint(tMapPoint4);
            tMapPolyLine.addLinePoint(tMapPoint5);
            tMapPolyLine.addLinePoint(tMapPoint6);
        }

    }
    public class N3N4 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N3N4(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.50489,126.954118);
            tMapPoint2 = new TMapPoint(37.504771,126.954498);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N4N5 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N4N5(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504771,126.954498);
            tMapPoint2 = new TMapPoint(37.504625,126.954832);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N4N43 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;
        TMapPoint tMapPoint3= null;
        TMapPoint tMapPoint4= null;
        TMapPoint tMapPoint5= null;

        public N4N43(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504771,126.954498);
            tMapPoint2 = new TMapPoint(37.505133, 126.954726);
            tMapPoint3 = new TMapPoint( 37.505120, 126.954973);
            tMapPoint4 = new TMapPoint( 37.505184, 126.955338);
            tMapPoint5 = new TMapPoint(37.504986,126.955981);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
            tMapPolyLine.addLinePoint(tMapPoint4);
            tMapPolyLine.addLinePoint(tMapPoint5);
        }

    }
    public class N5N6 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N5N6(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504625,126.954832);
            tMapPoint2 = new TMapPoint(37.504462,126.955176);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N6N7 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N6N7(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504462,126.955176);
            tMapPoint2 = new TMapPoint(37.504355,126.955451);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N7N8 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N7N8(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504355,126.955451);
            tMapPoint2 = new TMapPoint(37.504264,126.95559);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N8N9 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N8N9(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504264,126.95559);
            tMapPoint2 = new TMapPoint(37.503813,126.955561);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N8N17 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N8N17(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504264,126.95559);
            tMapPoint2 = new TMapPoint(37.504129,126.956316);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N9N10{

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;
        TMapPoint tMapPoint3= null;
        TMapPoint tMapPoint4= null;

        public N9N10(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.503813,126.955561);
            tMapPoint2 = new TMapPoint(37.503272, 126.955691);
            tMapPoint3 = new TMapPoint( 37.503021, 126.955900);
            tMapPoint4 = new TMapPoint(37.502949,126.956316);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
            tMapPolyLine.addLinePoint(tMapPoint4);
        }

    }
    public class N10N11 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N10N11(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.502949,126.956316);
            tMapPoint2 = new TMapPoint(37.502944,126.957069);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N11N12 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N11N12(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.502944,126.957069);
            tMapPoint2 = new TMapPoint(37.502992,126.957412);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N12N13 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N12N13(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.502992,126.957412);
            tMapPoint2 = new TMapPoint(37.503355,126.957406);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N12N14 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;
        TMapPoint tMapPoint3= null;

        public N12N14(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.502992,126.957412);
            tMapPoint2 = new TMapPoint(37.503013, 126.957802);
            tMapPoint3 = new TMapPoint(37.50324,126.957969);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
        }

    }
    public class N13N15 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N13N15(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.503355,126.957406);
            tMapPoint2 = new TMapPoint(37.50379,126.957448);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N13N16 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N13N16(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.503355,126.957406);
            tMapPoint2 = new TMapPoint(37.503995,126.956684);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N15N20 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;
        TMapPoint tMapPoint3= null;

        public N15N20(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.50379,126.957448);
            tMapPoint2 = new TMapPoint(37.503941, 126.957646);
            tMapPoint3 = new TMapPoint(37.50438,126.957655);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
        }

    }
    public class N16N17 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N16N17(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.503995,126.956684);
            tMapPoint2 = new TMapPoint(37.504129,126.956316);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N16N18 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N16N18(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.503995,126.956684);
            tMapPoint2 = new TMapPoint(37.504511,126.95675);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N18N19 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N18N19(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504511,126.95675);
            tMapPoint2 = new TMapPoint(37.504443,126.957316);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N18N43 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N18N43(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504511,126.95675);
            tMapPoint2 = new TMapPoint(37.504986,126.955981);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N19N20 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N19N20(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504443,126.957316);
            tMapPoint2 = new TMapPoint(37.50438,126.957655);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }

    }
    public class N19N22 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1 = null;
        TMapPoint tMapPoint2 = null;
        TMapPoint tMapPoint3 = null;

        public N19N22() {
            tMapPolyLine = new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504443, 126.957316);
            tMapPoint2 = new TMapPoint(37.505136, 126.957775);
            tMapPoint3 = new TMapPoint(37.505056, 126.958139);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
        }
    }
    public class N19N41 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1 = null;
        TMapPoint tMapPoint2 = null;

        public N19N41() {
            tMapPolyLine = new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504443,126.957316);
            tMapPoint2 = new TMapPoint(37.50474,126.957043);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N20N21 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1 = null;
        TMapPoint tMapPoint2 = null;
        TMapPoint tMapPoint3 = null;
        TMapPoint tMapPoint4 = null;

        public N20N21() {
            tMapPolyLine = new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.50438, 126.957655);
            tMapPoint2 = new TMapPoint(37.504456, 126.957759);
            tMapPoint3 = new TMapPoint(37.504370, 126.958177);
            tMapPoint4 = new TMapPoint(37.50483, 126.958465);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
            tMapPolyLine.addLinePoint(tMapPoint4);
        }
    }
    public class N21N22 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1 = null;
        TMapPoint tMapPoint2 = null;

        public N21N22() {
            tMapPolyLine = new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.50483,126.958465);
            tMapPoint2 = new TMapPoint(37.505056,126.958139);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N21N38 {

        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1 = null;
        TMapPoint tMapPoint2 = null;

        public N21N38() {
            tMapPolyLine = new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.50483,126.958465);
            tMapPoint2 = new TMapPoint(37.505083,126.958608);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N22N23 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N22N23(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505056,126.958139);
            tMapPoint2 = new TMapPoint(37.505419,126.958335);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

    public class N23N24 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N23N24(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505419,126.958335);
            tMapPoint2 = new TMapPoint(37.505625,126.95844);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

    public class N23N34 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N23N34(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505419,126.958335);
            tMapPoint2 = new TMapPoint(37.505619,126.957685);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N23N38 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;
        TMapPoint tMapPoint3= null;

        public N23N38(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505419,126.958335);
            tMapPoint2 = new TMapPoint(37.505285, 126.958655);
            tMapPoint3 = new TMapPoint(37.505083,126.958608);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
        }
    }
    public class N24N25 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N24N25(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505625,126.95844);
            tMapPoint2 = new TMapPoint(37.505765,126.958427);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N25N26 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N25N26(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505765,126.958427);
            tMapPoint2 = new TMapPoint(37.505932,126.958432);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N26N27 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N26N27(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505932,126.958432);
            tMapPoint2 = new TMapPoint(37.506168,126.958448);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N27N28 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N27N28(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.506168,126.958448);
            tMapPoint2 = new TMapPoint(37.506484,126.958482);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N27N30 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N27N30(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.506168,126.958448);
            tMapPoint2 = new TMapPoint(37.506141,126.958016);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N28N29 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N28N29(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.506484,126.958482);
            tMapPoint2 = new TMapPoint(37.506867,126.958474);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N30N31 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N30N31(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.506141,126.958016);
            tMapPoint2 = new TMapPoint(37.506131,126.957584);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N31N32 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N31N32(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.506131,126.957584);
            tMapPoint2 = new TMapPoint(37.505792,126.957353);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N32N33 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N32N33(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505792,126.957353);
            tMapPoint2 = new TMapPoint(37.505915,126.957122);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N32N34 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N32N34(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505792,126.957353);
            tMapPoint2 = new TMapPoint(37.505619,126.957685);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N33N35 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N33N35(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505915,126.957122);
            tMapPoint2 = new TMapPoint(37.505529,126.956862);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N34N37 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N34N37(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505619,126.957685);
            tMapPoint2 = new TMapPoint(37.505256,126.957437);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N35N36 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N35N36(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505529,126.956862);
            tMapPoint2 = new TMapPoint(37.505416,126.957093);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N35N39 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;
        TMapPoint tMapPoint3= null;
        TMapPoint tMapPoint4= null;

        public N35N39(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505529,126.956862);
            tMapPoint2 = new TMapPoint(37.505324, 126.956692);
            tMapPoint3 = new TMapPoint(37.505170, 126.956418);
            tMapPoint4 = new TMapPoint(37.505156,126.956224);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
            tMapPolyLine.addLinePoint(tMapPoint3);
            tMapPolyLine.addLinePoint(tMapPoint4);

        }
    }
    public class N36N37 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N36N37(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505416,126.957093);
            tMapPoint2 = new TMapPoint(37.505256,126.957437);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N37N42 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N37N42(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505256,126.957437);
            tMapPoint2 = new TMapPoint(37.504903,126.957181);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N39N40 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N39N40(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505156,126.956224);
            tMapPoint2 = new TMapPoint(37.504873,126.956635);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

    public class N39N43 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N39N43(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505156,126.956224);
            tMapPoint2 = new TMapPoint(37.504986,126.955981);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

    public class N40N41 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N40N41(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504873,126.956635);
            tMapPoint2 = new TMapPoint(37.50474,126.957043);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

    public class N41N42 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N41N42(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.50474,126.957043);
            tMapPoint2 = new TMapPoint(37.504903,126.957181);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

    public class N3N44 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N3N44(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.50489,126.954118);
            tMapPoint2 = new TMapPoint(37.505066,37.505066);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

    public class N5N45 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N5N45(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504625,126.954832);
            tMapPoint2 = new TMapPoint(37.504793,126.954959);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N6N46 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N6N46(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504462,126.955176);
            tMapPoint2 = new TMapPoint(37.504341,126.954932);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N7N47 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N7N47(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504355,126.955451);
            tMapPoint2 = new TMapPoint(37.504525,126.955641);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N10N48 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N10N48(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.502949,126.956316);
            tMapPoint2 = new TMapPoint(37.503212,126.956195);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N10N49 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N10N49(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.502949,126.956316);
            tMapPoint2 = new TMapPoint(37.502618,126.955817);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N11N50 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N11N50(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.502944,126.957069);
            tMapPoint2 = new TMapPoint(37.50275,126.957011);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

    public class N15N51 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N15N51(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.50379,126.957448);
            tMapPoint2 = new TMapPoint(37.503811,126.957763);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N40N52 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N40N52(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504873,126.956635);
            tMapPoint2 = new TMapPoint(37.504809,126.956581);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N24N53 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N24N53(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505625,126.95844);
            tMapPoint2 = new TMapPoint(37.505584,126.958767);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N25N54 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N25N54(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505765,126.958427);
            tMapPoint2 = new TMapPoint(37.505642,126.958289);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N26N55 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N26N55(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.505932,126.958432);
            tMapPoint2 = new TMapPoint(37.505944,126.958556);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N28N56 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N28N56(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.506484,126.958482);
            tMapPoint2 = new TMapPoint(37.506264,126.9588);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N42N57 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N42N57(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504903,126.957181);
            tMapPoint2 = new TMapPoint(37.504873,126.957024);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }
    public class N17N58 {
        protected TMapPolyLine tMapPolyLine;
        TMapPoint tMapPoint1= null;
        TMapPoint tMapPoint2= null;

        public N17N58(){
            tMapPolyLine=new TMapPolyLine();
            tMapPolyLine.setLineColor(Color.BLUE);
            tMapPolyLine.setLineWidth(2);
            tMapPoint1 = new TMapPoint(37.504129,126.956316);
            tMapPoint2 = new TMapPoint(37.504367,126.9563);
            tMapPolyLine.addLinePoint(tMapPoint1);
            tMapPolyLine.addLinePoint(tMapPoint2);
        }
    }

}