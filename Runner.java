import java.util.*;
public class Runner {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Msg Test 1 uname-mesg: ");
        String one = scan.nextLine();
        String name = one.substring(0, one.indexOf("-"));
        String text = one.substring(one.indexOf("-") + 1);
        MessagePost mes1 = new MessagePost(name, text);

        System.out.print("Msg Test 2 uname-mesg: ");
        String two = scan.nextLine();
        String name2 = two.substring(0, two.indexOf("-"));
        String text2 = two.substring(two.indexOf("-") + 1);
        MessagePost mes2 = new MessagePost(name2, text2);

        System.out.print("Photos: uname-filename-caption: ");
        String photo = scan.nextLine();
        String picName = photo.substring(0, photo.indexOf("-"));
        photo = photo.substring(photo.indexOf("-")+1);
        String fileName = photo.substring(0, photo.indexOf("-"));
        String caption = photo.substring(photo.indexOf("-")+1);
        PhotoPost p = new PhotoPost(picName, fileName, caption);

        NewsFeed news = new NewsFeed();
//        Post post = new Post(name);
//        mes1.addComment(text);
//        news.addPost(mes1);
//        mes1.getText();
        mes1.addComment(text);
        mes1.getText();

//        Post post2 = new Post(name2);
        mes2.addComment(text2);
        news.addPost(mes2);
        mes2.getText();


        mes1.display();
        mes2.display();
        p.display();
        System.out.println(p.getCaption());
        System.out.println(p.getImageFile());


    }
}
