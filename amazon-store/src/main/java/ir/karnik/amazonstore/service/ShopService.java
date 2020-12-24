package ir.karnik.amazonstore.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

    @Value("${amazon.server.financial-unit}")
    String financialServer;

    private final RestTemplate restTemplate;

    public ShopService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * متد پیدا کردن همه دسته بندی های اجناس فروشگاه
     *
     * @return list String
     */
    public List<String> getAllCategory() {
        List<String> categories = new ArrayList<>();
        categories.add("mobile");
        categories.add("laptop");
        categories.add("watch");
        categories.add("car");

        return categories;

    }

    /**
     * این متد بر اساس نام دسته بندی به مایکروسرویس ms-financial-unit درخواست میفرستد تا جزییات آن دسته بندی را بگیرد
     * @param category نام دسته بندی
     * @return list string
     */
    public List<String> getCategoryItem(String category) {

        StringBuilder url = new StringBuilder();
        url.append("http://")
                .append(financialServer)
                .append("/amazon/items/get-by-category")
                .append("?category=")
                .append(category);

        return restTemplate.exchange(url.toString(), HttpMethod.GET, null, List.class).getBody();
    }
}
