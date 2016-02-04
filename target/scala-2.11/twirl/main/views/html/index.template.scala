
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Ancistor")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

    """),format.raw/*5.5*/("""<div style="width:500px;height:50px;border"></div>

    """),_display_(/*7.6*/bar()/*7.11*/{_display_(Seq[Any](format.raw/*7.12*/("""

        """),format.raw/*9.9*/("""<div style="width:500px ; height:50px ; border"></div>

        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/messages.js")),format.raw/*11.73*/(""""></script>
        <div id="messages" class="center-block col-md-6" style="float: none ; padding: 10px"></div>
    """)))}),format.raw/*13.6*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Feb 04 10:46:25 PST 2016
                  SOURCE: /Users/galois/Desktop/activator-1.3.7-minimal/play-scala-portfolio/app/views/index.scala.html
                  HASH: 6dc1a6f2847db6f82ba751df675e70aac44345de
                  MATRIX: 527->1|639->18|667->21|691->37|730->39|762->45|844->102|857->107|895->108|931->118|1036->196|1051->202|1116->246|1263->363|1295->365
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7|31->7|31->7|33->9|35->11|35->11|35->11|37->13|38->14
                  -- GENERATED --
              */
          