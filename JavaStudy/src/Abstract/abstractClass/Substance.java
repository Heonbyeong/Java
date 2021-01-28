package Abstract.abstractClass;

public class Substance extends Abstract{
    public Substance(String owner) {
        super(owner);
    }
    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
