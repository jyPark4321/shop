package shop.shopping.domain.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity

@Getter
@Setter
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
