package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Order {
    List<OrderDetails> list;
    public List<OrderDetails> getList() {
        return list;
    }
    public Order() {
        this.list = new ArrayList<>();
    }
    public void setList(List<OrderDetails> list) {
        this.list = list;
    }
    public void addProduct(Product product,int quantity){
       list.add(new OrderDetails(product,quantity));
    }
}
