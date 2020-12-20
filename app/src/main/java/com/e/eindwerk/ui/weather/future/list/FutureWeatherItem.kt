package com.e.eindwerk.ui.weather.future.list

import com.e.eindwerk.R
import com.e.eindwerk.internal.glide.GlideApp
import com.e.eindwerk.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.FormatStyle

class FutureWeatherItem(
        val weatherEntry: UnitSpecificSimpleFutureWeatherEntry
) : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.apply {
            txtCondition.text = weatherEntry.conditionText
            updateDate()
            updateTemperature()
            updateConditionImage()
        }
    }

    override fun getLayout() = R.layout.item_future_weather

    private fun ViewHolder.updateDate() {
        val dtFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
        txtDate.text = weatherEntry.date.format(dtFormatter)
    }

    private fun ViewHolder.updateTemperature() {
        txtTemperature.text = "${weatherEntry.avgTemperature}°C"
    }

    private fun ViewHolder.updateConditionImage() {
        GlideApp.with(this.containerView)
                .load("http:" + weatherEntry.conditionIconUrl)
                .into(imgCondition)
    }
}