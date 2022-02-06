package com.emotionfactry.clickerclient.domain.model

import com.emotionfactry.clickerclient.R

data class Counter (
    var title: String?,
    var value: Long?,
    var group: CounterGroup?,
    val canDecrease: Boolean? = false,
        ) {
    init{
        getRelevantTitle()
        setDefaultValue()
        setDefaultGroup()
    }

    private fun getRelevantTitle(){
        if (title == null)
        this.title = title.let{"Default title"}
    }

    private fun setDefaultValue(){
    if (value == null)
        this.value = value.let{0}
    }

    private fun setDefaultGroup() {
        if (group == null)
            group = CounterGroup(title = "No Group", color = R.color.noGroup)
    }


}