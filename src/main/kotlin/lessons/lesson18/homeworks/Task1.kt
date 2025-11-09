package ru.stimmax.lessons.lesson18.homeworks

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

//Задача 1. Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.

//Холодильник
abstract class Fridge : Powerable, Openable, TemperatureRegulatable, Cleanable, Programmable

//Стиральная машина
abstract class Washer : Powerable, Openable, TemperatureRegulatable, WaterContainer, WaterConnection, AutomaticShutdown,
    Cleanable,
    Programmable, Timable, SoundEmitting

//Умная лампа
abstract class SmartLamp : Powerable, AutomaticShutdown, Timable, Mechanical, LightEmitting, SoundEmitting,
    Programmable {}

//Электронные часы
abstract class ElectronicWatches : Powerable, Timable, BatteryOperated, Rechargeable, Programmable, SoundEmitting {}

//Робот-пылесос
abstract class RobotVacuumCleaner : Powerable, Openable, AutomaticShutdown, Timable, BatteryOperated, LightEmitting,
    Programmable,
    Movable, Cleanable, Rechargeable {}

//Механические часы
abstract class MechanicalWatches : Powerable, Timable, Mechanical, SoundEmitting {}

//Фонарик
abstract class Lantern : Powerable, Openable, BatteryOperated, LightEmitting, Programmable {}

//Кофемашина
abstract class CoffeeMachine : Powerable, Openable, WaterContainer, TemperatureRegulatable, AutomaticShutdown,
    Drainable, Timable, SoundEmitting, Programmable, Cleanable {}

//Умная колонка
abstract class SmartSpeaker : Powerable, AutomaticShutdown, Timable, LightEmitting, SoundEmitting, Programmable,
    Rechargeable

