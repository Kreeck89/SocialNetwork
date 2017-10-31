package facebook.vertex.services;

import facebook.vertex.model.User;
import facebook.vertex.services.message.RecoverBuilder;

public class MessageService {

    public static void main(String[] args) {
        int sum = 0;
        User user = new User();
        user.setName("Vasiliy");
        user.setSurName("Brovkin");

        MessageBuilder builder = new RecoverBuilder();
        String message = builder.build(user);
        System.out.println(message);

        char[] chars = message.toCharArray();
        for (char element : chars) {
            sum += (int)element;
        }
        System.out.println("Sum of char numbers: " + sum);
    }
}
