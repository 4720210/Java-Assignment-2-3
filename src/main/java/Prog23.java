/**
 * クラス Prog23 の注釈をここに書きます.
 * 
 * @author (河野大地)
 * @version (バージョン番号もしくは日付)
 */
public class Prog23{
    
    public static void main(String[] args) {
        int input, input2;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("料金：１）大人（高校生以上）、２）小人（中学生以下）、３）動物園パスポート");
        System.out.println("区分を入力してください：");
        input = sc.nextInt(); // 整数のキーボード入力を受け付ける
    if(input==1){
        System.out.println("旭川市在住者であることがわかる証書がありますか？　１）はい、２）いいえ：");
        input2 = sc.nextInt();
            if(input2==1){
            System.out.println("700円です。");
        }
        else{
            System.out.println("1,000円です。");
        }
    }
    else if(input==2){
        System.out.println("無料です。");
    }
    else if(input==3){
        System.out.println("1,400円です。");
    }// ここからプログラムを追加する
    else
        System.out.println("区分の入力が正しくありません");
	    
    
    }
}

