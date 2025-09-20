package com.example.backendWebsite.components

import androidx.compose.runtime.Composable
import com.example.backendWebsite.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaStar
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ModuleCard(
    breakpoint: Breakpoint,
    moduleTitle : String,
    moduleDesc : String
    ){
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint <= Breakpoint.MD) 100.percent
                else Res.Dimens.MAX_MODULE_CARD_WIDTH.px
            )
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height(Res.Dimens.MAX_MODULE_CARD_HEIGHT.px)

            )
            .padding(all = 12.px)
            .borderRadius(Res.Dimens.BORDER_RADIUS.px)
            .backgroundColor(Res.Theme.DARK_CARD.color),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.px)
    ) {
        P(
            attrs = Modifier
                .fontSize(24.px)
                .color(Colors.Black)
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .toAttrs()
        ) {
            Text(moduleTitle)
        }

        P(
            attrs = Modifier
                .fontSize(16.px)
                .color(Colors.Black.copy(50))
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .toAttrs()
        ) {
            Text(moduleDesc)
        }
    }
}