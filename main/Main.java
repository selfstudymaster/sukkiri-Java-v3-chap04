package main;

// chap04 配列
// code04-01 配列を使わないコード
//public class Main {
//    public static void main(String[] args) {
//        int sansu = 20;
//        int kokugo = 30;
//        int rika = 40;
//        int eigo = 50;
//        int shakai = 80;
//
//        int sum = sansu + kokugo + rika + eigo + shakai;
//
//        int avg = sum / 5;
//        System.out.println("合計点:" + sum);
//        System.out.println("平均点:" + avg);
//    }
//}

// code04-02
//public class Main {
//    public static void main(String[] args) {
//        // 配列変数の宣言
//        int[] score;
//        // 配列の作成と代入
//        score = new int[5];
//    }
//}

// code-04-03, 04-04
//public class Main {
//    public static void main(String[] args) {
//        // 配列変数の宣言と、配列の作成
//        int[] score = new int[5];
//        int kobakos = score.length;
//        System.out.println("要素の数" + kobakos);
//    }
//}

// code-04-05 配列の要素に値を代入
//public class Main {
//    public static void main(String[] args) {
//        // 配列変数の宣言と、配列の作成
//        int[] score;
//        score = new int[5];
//        // 要素score[1]に値30 を代入
//        score[1] = 30;
//        System.out.println(score[1]);
//    }
//}

// code-04-06 初期化されていない変数を利用
//public class Main {
//    public static void main(String[] args) {
//        int x;
//        System.out.println(x);
//        // エラーメッセージ(コンパイルエラー)
//        // java: 変数xは初期化されていない可能性があります
//    }
//}

// code-04-07 初期化されていない変数を利用
//public class Main {
//    public static void main(String[] args) {
//        // 自動的に初期化されたint型の配列(5つの要素の値は全て0で初期化される)
//        int[] score = new int[5];
//        System.out.println(score[0]);
//        // 実行結果: 0
//    }
//}

// code-04-08 点数管理プログラム(配列版)
//public class Main {
//    public static void main(String[] args) {
//
//        int[] score = { 20, 30, 40, 50, 80};
//        int sum = score[1] + score[2] + score[3] + score[4] + score[5]; // インデックス誤りによる例外エラー
//        int avg = sum / score.length;
//
//        System.out.println("平均点：" + sum);
//        System.out.println("合計点：" + avg);
//        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//        //	at main.Main.main(Main.java:78)
//    }
//}

// code-04-09 配列とfor文
//public class Main {
//    public static void main(String[] args) {
//
//        int[] score = { 20, 30, 40, 50, 80};
//        for (int i = 0; i < score.length; i++) {
//            System.out.println(score[i]);
//        }
//    }
//}

// code-04-10 従来のfor文での例
//public class Main {
//    public static void main(String[] args) {
//
//        int[] score = { 20, 30, 40, 50, 80};
//        for (int i = 0; i < score.length; i++) {
//            System.out.println(score[i]);
//        }
//    }
//}

// code-04-11 拡張for文の例
//public class Main {
//    public static void main(String[] args) {
//
//        int[] score = { 20, 30, 40, 50, 80};
//        for (int value : score) { // ループが1周するたびにscoreの要素がvalueに代入される
//            System.out.println(value);
//        }
//    }
//}

// code-04-12 実行結果は?
//public class Main {
//    public static void main(String[] args) {
//
//        int[] a = { 1, 2, 3};
//        int[] b;
//        b = a;
//        b[0] = 100;
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);
//    }
//}

// code-04-13 ガベージコレクション
//public class Main {
//    public static void main(String[] args) {
//
//        boolean b = true;
//
//        if (b == true) {
//            int[] i = {1, 2, 3};
//        } // 配列変数i はメモリから消滅
//    }
//}

// code-04-14 nullの利用
//public class Main {
//    public static void main(String[] args) {
//        int [] a = { 1, 2, 3}; // 参照型配列変数 a
//        a = null; // 参照型変数にはnullを代入できる
//        a[0] = 10;
//        System.out.println(a[0]);
////        エラー
////        Exception in thread "main" java.lang.NullPointerException
////        at main.Main.main(Main.java:155)
//    }
//}

// code-04-15 2次元配列
//public class Main {
//    public static void main(String[] args) {
//        // 2行3列の配列
//        int[][] score = new int[2][3];
//
//        score[0][0] = 40;
//        score[0][1] = 50;
//        score[0][2] = 60;
//        score[1][0] = 80;
//        score[1][1] = 60;
//        score[1][2] = 70;
//        System.out.println(score[1][1]);
//    }
//}

// code-04-16 親配列と子配列の要素数を表示
public class Main {
    public static void main(String[] args) {
        // 2行3列の配列をこのように初期化することも可能
        int[][] score = { { 10, 20, 30 }, { 30, 40, 50 } };

        System.out.println(score.length); // 実行結果:2
        System.out.println(score[0].length); // 実行結果:3
    }
}