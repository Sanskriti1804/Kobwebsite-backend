package com.example.backendWebsite.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.backendWebsite.pages.InputStyle
import com.example.backendWebsite.pages.Theme
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaHeart
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text


@Composable
fun IntroCard(breakpoint: Breakpoint) {
    var userName by remember { mutableStateOf("") }
    var colorMode by ColorMode.currentState

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            FaHeart(
                modifier = Modifier.margin(right = 10.px),
                style = IconStyle.OUTLINE,
                size = IconSize.XXL
            )
            P(
                attrs = Modifier
                    .fontSize(40.px)
                    .toAttrs()
            ) {
                Text(
                    value = "hiiii! $userName"
                )
            }
            FaHeart(
                modifier = Modifier.margin(left = 10.px),
                style = IconStyle.OUTLINE,
                size = IconSize.XXL,
            )

        }

        Input(
            type = InputType.Text,
            attrs = InputStyle.toModifier()
                .padding(15.px)
                .fontSize(20.px)
                .backgroundImage(
                    linearGradient(
                        Theme.LPink.color, Theme.Pink.color, LinearGradient.Direction.ToBottomRight
                    )
                )
//                .backgroundColor(Theme.LPink.color)
                .transition {
                    property("border")
                    duration(500.ms)
                    timingFunction(TransitionTimingFunction.EaseOut)
                }
                .toAttrs {
                    placeholder(value = "Enter your email")
                    onInput {
                        userName = it.value
                    }
                }
        )

        Button(
            modifier = Modifier.margin(top = 24.px).padding(12.px),
            onClick = {
                colorMode = colorMode.opposite
            }
        ) {
            if (colorMode.isLight) {
                FaMoon(
                    style = IconStyle.OUTLINE,
                    size = IconSize.XXL,
                )
            } else
                FaSun(
                    style = IconStyle.OUTLINE,
                    size = IconSize.XXL,
                )
        }

    }
}
