package com.example.backendWebsite.pages

import androidx.compose.runtime.*
import com.example.backendWebsite.components.Intro
import com.example.backendWebsite.components.ModuleCard
import com.example.backendWebsite.components.TechCard
import com.example.backendWebsite.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.focus
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Input


@Page
@Composable
fun HomePage() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .minHeight(100.vh)
            .padding(
                if (breakpoint <= Breakpoint.MD) 18.px
                else 32.px
            )
            .backgroundColor(
                Res.Theme.VANILLA.color
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(48.px)
    ){
        Intro(breakpoint = breakpoint)

        Div(
            attrs = Modifier
                .fillMaxWidth()
                .height(Res.Dimens.MAX_MODULE_SCROLL_HEIGHT.px)
                .toAttrs {
                    style {
                        property("display", "flex")
                        property("flex-wrap", "nowrap")    // 👈 keep cards in one row
                        property("overflow-x", "auto")     // 👈 horizontal scroll
                        property("gap", "16px")
                    }
                }
        ) {
            ModuleCard(breakpoint, "Relational Database", "Supabase (PostgresSQL)")
            ModuleCard(breakpoint, "Non-Relational Database", "MongoDb (KMongo)")
            ModuleCard(breakpoint, "Vector Database", "Pinecode")
            ModuleCard(breakpoint, "Container", "Docker")
            ModuleCard(breakpoint, "Message Queues", "RabbitMQ")
            ModuleCard(breakpoint, "Logs", "Logback")
            ModuleCard(breakpoint, "Metrics", "Prometheus + Grafana")
            ModuleCard(breakpoint, "Tracing", "Jaeger")
            ModuleCard(breakpoint, "Secret and Configs", "Docker secrets")
            ModuleCard(breakpoint, "Authentication & Security", "OAuth2 / OIDC + JWT + PKCE")
            ModuleCard(breakpoint, "CI/CD", "GitHub Actions workflows")
            ModuleCard(breakpoint, "AI / LLM Integration", "OpenAI GPT 3.5")
        }

        TechCard(breakpoint, Res.Image.PHOTO ,"Relational Database : Supabase(PostgresSQL)", "Purpose: Store well-defined, structured user data, predictions, and algorithm outputs", "Users, Birth Data, Astrology Chart, Numerology, Psychometrics, User Feedback - All core user info, algorithm results, and predictions stored here." )
        TechCard(breakpoint, Res.Image.PHOTO, "Non-Relational Database : MongoDb (KMongo)", "Purpose: Store semi-structured content, interpretations, logs, compatibility data.", "Interpretations, Compatibility, User Activity Logs - Flexible storage of evolving data, AI outputs, or logs")
        TechCard(breakpoint, Res.Image.PHOTO, "Vector Database (Semantic Layer) : Pinecone", "Purpose: Semantic search & AI-driven recommendations.", "User Embeddings, Archetype Embeddings, Insight Embeddings, Compatibility Embeddings - Convert structured/non-structured data → embeddings.")
        TechCard(breakpoint, Res.Image.PHOTO, "Algorithms", "Purpose: Generate raw values for astrology, numerology, psychometrics.", "Astrology\n" +
                "\n" +
                "Ephemeris calculations (planet positions)\n" +
                "\n" +
                "House system (Placidus / Whole Sign)\n" +
                "\n" +
                "Aspect detection (conjunction, square, trine, opposition)\n" +
                "\n" +
                "Numerology\n" +
                "\n" +
                "Pythagorean / Chaldean calculations\n" +
                "\n" +
                "Reduce numbers to core numbers: Life Path, Soul Urge\n" +
                "\n" +
                "Psychometrics\n" +
                "\n" +
                "MBTI: questionnaire → type assignment\n" +
                "\n" +
                "Big5: Likert-scale → OCEAN scores\n" +
                "\n" +
                "Enneagram: scoring → type + wing - Output stored in relational DB.")
        TechCard(breakpoint, Res.Image.PHOTO, "Containers", "Docker containers for Ktor app + dependencies", "")
        TechCard(breakpoint, Res.Image.PHOTO, "Message Queues", "RabbitMQ", "Async task processing, improves response time.")
        TechCard(breakpoint, Res.Image.PHOTO, "Logs", "Logback", "")
        TechCard(breakpoint, Res.Image.PHOTO, "metrics", "Prometheus + Grafana","")
        TechCard(breakpoint, Res.Image.PHOTO, "traces", "","")
        TechCard(breakpoint, Res.Image.PHOTO, "traces", "Jaeger","")
        TechCard(breakpoint, Res.Image.PHOTO, "Secret and Configs", "Docker secrets","")
        TechCard(breakpoint, Res.Image.PHOTO, "Authentication & Security", "OAuth2 / OIDC + JWT + PKCE","Backend verifies tokens per request")
        TechCard(breakpoint, Res.Image.PHOTO, "CI/CD", "GitHub Actions workflows","workflows for build, test, deploy")
        TechCard(breakpoint, Res.Image.PHOTO, "Models : OpenAI GPT 3.5 ", "RAG (Retrieval-Augmented Generation)","Combines vector DB + LLM → context-aware responses")
    }
}
















enum class Theme(val color : CSSColorValue ){
    Pink(color = rgb(r = 251, g = 116, b = 168)),
    LPink(color = rgb(r = 251, g = 198, b = 207))
}

val InputStyle = CssStyle {
    base {
        Modifier.border {
            width(2.px)
            style(LineStyle.Dashed)
            color(Theme.LPink.color)
        }
    }

    focus{
        Modifier.border {
            width(12.px)
            style(LineStyle.Solid)
            color(Theme.Pink.color)
        }
    }
}

@Composable
fun InputEmail(){
    Input(
        type = InputType.Text,
        attrs = Modifier
            .padding(15.px)
            .fontSize(20.px)
            .toAttrs{
                placeholder(value = "Enter your email")
                onInput {
//                    userName = it
                }

            }
    )
}




