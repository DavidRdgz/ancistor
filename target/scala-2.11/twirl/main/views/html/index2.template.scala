
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index2_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tag: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Twitter-Clone")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

    """),format.raw/*5.5*/("""<div style="width:500px;height:50px;border"></div>

    """),_display_(/*7.6*/bar()/*7.11*/{_display_(Seq[Any](format.raw/*7.12*/("""

        """),format.raw/*9.9*/("""<div style="width:500px ; height:50px ; border"></div>

        <script id="tagger" type="text/javascript" src=""""),_display_(/*11.58*/routes/*11.64*/.Assets.versioned("javascripts/hashtags.js")),format.raw/*11.108*/("""" querytag="""),_display_(/*11.120*/tag),format.raw/*11.123*/("""></script>
        <div id="messages" class="center-block col-md-6" style="float: none; padding: 10px"></div>
    """)))}),format.raw/*13.6*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(tag:String): play.twirl.api.HtmlFormat.Appendable = apply(tag)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (tag) => apply(tag)

  def ref: this.type = this

}


}

/**/
object index2 extends index2_Scope0.index2
              /*
                  -- GENERATED --
                  DATE: Fri Jan 29 16:08:41 PST 2016
                  SOURCE: /Users/galois/Desktop/activator-1.3.7-minimal/play-scala-portfolio/app/views/index2.scala.html
                  HASH: 9c98be3d84682859bdb4e824fc3c6db1938636f0
                  MATRIX: 529->1|637->14|665->17|694->38|733->40|765->46|847->103|860->108|898->109|934->119|1074->232|1089->238|1155->282|1195->294|1220->297|1365->412|1397->414
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7|31->7|31->7|33->9|35->11|35->11|35->11|35->11|35->11|37->13|38->14
                  -- GENERATED --
              */
          