package banking;

import com.google.gson.Gson;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import org.thymeleaf.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Convert
public class WalletMapConverter implements AttributeConverter<Map<String,String>,String> {
    private static Gson gson = new Gson();

    @Override
    public String convertToDatabaseColumn(Map<String, String> attribute) {
        if (attribute == null) {return null;}
        return gson.toJson(attribute);
    }

    @Override
    public Map<String, String> convertToEntityAttribute(String dbData) {
        if(StringUtils.isEmpty(dbData)) return new HashMap<>();
        return gson.fromJson(dbData, Map.class);
    }
}
