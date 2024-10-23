package Chap10.Inherit;
//자식 제네릭 클래스
public class ChildProduct<T,M,C> extends Product<T,M> {
    private C company;

    ChildProduct(T kind,M model,C company) {
        super(kind,model);
        this.company = company;
    }

    public C getCompany() {
        return company;
    }
}
