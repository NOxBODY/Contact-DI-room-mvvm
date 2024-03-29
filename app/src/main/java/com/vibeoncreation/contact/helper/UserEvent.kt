package com.vibeoncreation.contact.helper

import com.vibeoncreation.contact.data.ContactModel

sealed interface UserEvent {
    data object SaveContact: UserEvent
    data class SetFirstName( val firstName: String): UserEvent
    data class SetLastName(val lastName: String): UserEvent
    data class SetPhoneNumber(val phoneNumber: String): UserEvent
    data object ShowAddDialog: UserEvent
    data class ShowEditDialog(val contact: ContactModel) : UserEvent
    data object HideDialog: UserEvent
    data class SortContacts(val sortType: SortType): UserEvent
    data class DeleteContact(val contact: ContactModel): UserEvent
    data class EditContact(val contactId: Int): UserEvent
}