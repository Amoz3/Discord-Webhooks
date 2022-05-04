## simple way to build and execute discord webhooks

### how to build a webhook.
this snippet doesnt support everything that can be added to a webhook, if you are looking to add more consult
https://discord.com/developers/docs/resources/webhook 

![Example webhook](https://i.imgur.com/VWdZewl.png)
see below for the code that built this
```java
        // Fields
        FieldPojo lvlField = new FieldPojo("level", "99", true);
        FieldPojo gpField = new FieldPojo("gp made", "2.4b", true);
        FieldPojo runtime = new FieldPojo("runtime", "10 hours bonidled", false);
        FieldPojo[] fieldPojos = new FieldPojo[]{lvlField, gpField, runtime};

        // Embeds
        EmbedPojo embedPojo = new EmbedPojo("this is the embed title", "this is the embeds description", fieldPojos);
        EmbedPojo[] embedPojos = new EmbedPojo[]{embedPojo};

        // the whole webhook
        WebHookPojo webHook = new WebHookPojo(embedPojos);
```
There is 3 pojos used to create the webhook, assuming you use embeds not content.

WebHookPojo - This holds an array of EmbedPojos (discord will allow up to 10), username, avatar_url & content
content is just a string that will be sent as a normal message.

EmbedPojo - holds an array of fields, a title and desciption, discord also supports images but i havent added those.

FieldPojo - in the example webhook above you see 3 fields, the white text are the names, the text below them are values.
the boolean inline sets if they will continue on the same line or make their own line
level and gp made are both true for inline, runtime is false

### how to execute a webhook.
call WebHookUtil#execute()

url - string of your discord webhook url,

webhook - the webhookpojo you've built, see example webhook for how to put one together
