package udemhacksZalik.Zalik.Controllers;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;

@RestController
@RequestMapping("/api/gemini")
public class GeminiController {
    @Autowired
    private VertexAiGeminiChatModel chatModel;

    public GeminiController(VertexAiGeminiChatModel chatModel) {
        this.chatModel = chatModel;
        System.out.println("THIS IS THE CACA PIPI THAT IS CACA PIPIYING "+chatModel.toString());
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        Prompt prompt = new Prompt(message);
        return chatModel.call(prompt).getResult().getOutput().getText();
    }
}
