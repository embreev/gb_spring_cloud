import com.gb.cloudmarket.backend.CloudMarketAppBackend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudMarketAppFrontend {
	public static void main(String[] args) {
		SpringApplication.run(CloudMarketAppBackend.class, args);
	}
}
