package ru.stimmax.lessons.lesson3.homework



//    Название мероприятия
    val name: String = "Monster Hackaton"

//    Дата проведения
    val date: String = "20 ноября 2025"

//    Место проведения
    val location: String = "Frunze str, 123"

//    Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    private val detailBudget: String = "подробная информация с перечислением поставщиков и сумм для внутреннего пользования"

//    Количество участников
    var participantsCount: Int = 50

//    Длительность хакатона
    var duration: Int = 3

//    Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    private val contactsAndInfoOfAgreement: String = "Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг"

//    Текущее состояние хакатона (статус)
    var status: Boolean = false

//    Список спонсоров
    val sponsors: String = "Sponsors"

//    Бюджет мероприятия
    private val budget: Int = 1000000

//    Текущий уровень доступа к интернету
    private var wifiStatus: Boolean = false

//    Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    private var logisticInfo: String = "Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки"

//    Количество команд
    val comandCount: Int = 10

//    Перечень задач
    var taskList: String = ""

//    План эвакуации
    val evacuationPlan: String by lazy {
        "Warning! Plan!"
    }

//    Список доступного оборудования (всё, что выделено для использования на мероприятии)
    private val environmentAvailableList: String = "environment list"

//    Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
    private var environmentActualList: String ="list"

//    График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    private lateinit var mealSchedule: String

//    План мероприятий на случай сбоев
    val exceptionPlan: String = "Alarm list"

//    Список экспертов и жюри
    var expertsList:String = "olay, petya, katya"

//    Политика конфиденциальности
    val privatePolicy:String = "private policy"

//    Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    private val userFeedback:String by lazy {"feedback"}

//    Текущая температура в помещении
   var currentTempuratory:Int = 23

//    Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
    private var pki:String =  "data"

//    Регулятор скорости интернета (понижающий коэффициент, например 0.5)
    private val sppedIndex:Double = 0.5

//    Уровень освещения
    private var lightLevel:Int = 2

//    Лог событий мероприятия
    private val log:String by lazy {"log"}

//    Возможность получения медицинской помощи прямо на мероприятии (да/нет)
    val isMedicineHelp:Boolean = true

//    Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
    val protocolsAndPlans:String = "palns"

//    Регистрационный номер мероприятия
    const val registrationNumber:String = "123456"

//    Максимально допустимый уровень шума в помещении хакатона.
    const val volumeLevel:Int = 1234

//    Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
    private var indexVolumeLevel:Boolean = false

//    План взаимодействия с прессой
    val reportersPlan:String = "plan"

//    Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    lateinit var projectInfo:String

//    Статус получения всех необходимых разрешений для проведения мероприятия
    private var permissionStatus:Boolean = false

//    Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
    private val indexEnvironmentAvailability:Double = 1.0

//    Список партнеров мероприятия
    var partnersList:String = "partners list"

//    Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    val mediaReport:String by lazy {"media report"}

//    Внутренние правила распределения призов
    private val internalRules:String = "rules"

//    Список разыгрываемых призов
    val prizesPlan:String = "giftplan"

//    Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
    private val emergencyContacts:String = "emergency contacts"

//    Особые условия для участников с ограниченными возможностями
    val termsForDisability: Boolean = true

//    Общее настроение участников (определяется опросами)
    var spirit: Int = 50
    get() {return if (field >30) field else 0}
    set(value) {field =value}

//    Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
    lateinit var hakatonDetailPlan: String

//    Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
    val starPersonName: String by lazy {
        "Star Person"
}

//    Максимальное количество людей, которое может вместить место проведения.
    const val MAX_COUNT = 500

//    Количество часов, отведенное каждой команде для работы над проектом.
    val timeLimit: String = "1234"

