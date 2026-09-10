package chapter_seven;

/**
 * 2. Define a class named Message that contains an instance variable of type String
 * named text that stores any textual content for the Message. Create a method named
 * toString that returns the text field and also include a method to set this value.
 *  Next, define a class for SMS that is derived from Message and includes instance
 * variables for the recipientContactNo. Implement appropriate accessor and mutator methods.
 * The body of the SMS message should be stored in the inherited
 * variable text. Redefine the toString method to concatenate all text fields.
 *  Similarly, define a class for Email that is derived from Message and includes an
 * instance variable for the sender, receiver, and subject. The textual contents of the
 * file should be stored in the inherited variable text. Redefine the toString method
 * to concatenate all text fields.
 *  Create sample objects of type Email and SMS in your main method. Test your
 * objects bypassing them to the following subroutine that returns true if the object
 * contains the specified keyword in the text property.
 * public static boolean ContainsKeyword(Message messageObject,
 *  String keyword)
 * {
 *  if (messageObject.toString().indexOf(keyword,0) >= 0)
 *  return true;
 *  return false;
 * }
 *  Finally, include a method to encode the final message “This is Java” using an
 * encoding scheme, according to which, each character should be replaced by the
 * character that comes after it. For example, if the message contains character B or b,
 * it should be replaced by C or c accordingly, while Z or z should be replaced with
 * an A or a. If the final message is “This is Java”, then the encoded message should
 * be “UijtjtKbwb”.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_07_02
{
    public static void main(String[] args)
    {
        Message sms = new SMS("This is Java", "+972595126648");
        Message email = new Email("Solutions To Absolute Java Problems",
                "John Smith", "Sharaf Qeshta", "Java Programming");

        System.out.println(ContainsKeyword(sms, "This")); // true
        System.out.println(ContainsKeyword(email, "Absolute")); // true

        System.out.println(sms.encode()); // Uijt!jt!Kbwb  (! denote the spaces)

        System.out.println(sms.decode(sms.encode())); // This is Java
    }

    public static boolean ContainsKeyword(Message messageObject,
                                          String keyword)
    {
        if (messageObject.toString().indexOf(keyword,0) >= 0)
            return true;
        return false;
    }
}
package chapter_seven;

public class Email extends Message
{
    String receiver, sender, subject;

    public Email(String text)
    {
        super(text);
    }

    public Email(String text, String receiver,
                 String sender, String subject)
    {
        super(text);
        this.receiver = receiver;
        this.sender = sender;
        this.subject = subject;
    }

    public String toString()
    {
        return "Email Receiver: " + receiver + ", Email Sender: " + sender
                + ", Email Subject: " + subject + "\nEmail Text: " + text;
    }


    public String getReceiver()
    {
        return receiver;
    }

    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    public String getSender()
    {
        return sender;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }
}
package chapter_seven;

public class Message
{
    String text;

    public Message(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String toString()
    {
        return text;
    }

    public String encode()
    {
        String encoded = "";

        for (int i = 0; i < text.length(); i++)
            encoded += (char) (text.charAt(i) + 1);

        return encoded;
    }

    public String encode(String string)
    {
        String encoded = "";

        for (int i = 0; i < string.length(); i++)
            encoded += (char) (string.charAt(i) + 1);

        return encoded;
    }

    public String decode(String string)
    {
        String decoded = "";

        for (int i = 0; i < string.length(); i++)
            decoded += (char) (string.charAt(i) - 1);

        return decoded;
    }
}package chapter_seven;

public class SMS extends Message
{
    String recipientContactNo;

    public SMS(String text)
    {
        super(text);
    }

    public SMS(String text, String recipientContactNo)
    {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo()
    {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo)
    {
        this.recipientContactNo = recipientContactNo;
    }

    public String toString()
    {
        return "SMS Body: " + text + "\nSMS Receiver: " + recipientContactNo;
    }
}
