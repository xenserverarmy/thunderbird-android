package app.k9mail.feature.navigation.drawer.domain.entity

import kotlinx.collections.immutable.ImmutableList

internal data class DisplayTreeFolder(
    val displayFolder: DisplayFolder?,
    val displayName: String?,
    val totalUnreadCount: Int,
    val totalStarredCount: Int,
    val children: ImmutableList<DisplayTreeFolder>,
)
