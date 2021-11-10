import com.Stevedores.Stevedores.Controller.ServiceOrderManager;
import com.Stevedores.Stevedores.Model.Party;
import com.Stevedores.Stevedores.Model.PortServiceOrder;
import com.Stevedores.Stevedores.Model.Resource;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServiceOrderManagerTests {

    @Test
    public void CreatePortServiceOrderTest(){
        ServiceOrderManager serviceOrderManager = new ServiceOrderManager();
        PortServiceOrder expected = new PortServiceOrder();
        ArrayList<Resource> tempResources = new ArrayList<Resource>(Arrays.asList(
                new Resource(1L),
                new Resource(2L),
                new Resource(3L),
                new Resource(4L)
        ));

        PortServiceOrder actual = serviceOrderManager.CreateNewServiceOrder("testShipName", LocalDate.of(2021, Month.NOVEMBER,10),tempResources,new Party());

        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);




    }

}
