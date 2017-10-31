package facebook.vertex.services.message;

import facebook.vertex.model.User;
import facebook.vertex.services.MessageBuilder;

public class PresentRegistr extends MessageBuilder {

    @Override
    public String build(User user) {
        return "My friend, "
                + user.getSurName()
                + " "
                + user.getName()
                + ", happy see you on our service!!!";
    }
}
