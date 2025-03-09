package udemhacksZalik.Zalik.Controllers;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;

@RestController
@RequestMapping("/api/gemini")
@CrossOrigin(origins = "*")
public class GeminiController {
    @Autowired
    private VertexAiGeminiChatModel chatModel;

    public GeminiController(VertexAiGeminiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        Prompt prompt = new Prompt(message);
        return chatModel.call(prompt).getResult().getOutput().getText();
    }
}
