package swagger.petstore.pojo.pet.add;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AddPet {
    private List<String> photoUrls;
    private String name;
    private int id;
    private Category category;
    private List<TagsItem> tags;
    private String status;
}