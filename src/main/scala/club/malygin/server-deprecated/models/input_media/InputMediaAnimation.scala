package club.malygin.server.models.input_media

case class InputMediaAnimation(
    `type`: String,
    media: String,
    thumb: Option[InputFile] = None,
    caption: Option[String] = None,
    parse_mode: Option[String] = None,
    width: Option[Int] = None,
    height: Option[Int] = None,
    duration: Option[Int] = None
)
