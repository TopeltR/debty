package ee.taltech.debty.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class BillPayment {

    @Id
    Long id;
    User user;
    BigDecimal sum;

}
