package Transformation;

import cucumber.api.Transformer;

/**
 * Created by User on 31.03.2017.
 */
public class EmailTransform extends Transformer<String> {

    @Override
    public String transform(String userName){
        return userName.concat("@ea.com");
    }
}
