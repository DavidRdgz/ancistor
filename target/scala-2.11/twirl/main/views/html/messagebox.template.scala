
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object messagebox_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class messagebox extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
  <div class = "panel panel-primary">
    <div class = "panel-heading">
      <h3 class = "panel-title">"""),_display_(/*7.34*/title),format.raw/*7.39*/("""</h3>
    </div>

    <div class = "panel-body">
      This is a Basic panel
    </div>
  </div>
</html>"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object messagebox extends messagebox_Scope0.messagebox
              /*
                  -- GENERATED --
                  DATE: Mon Jan 25 17:26:45 PST 2016
                  SOURCE: /Users/galois/Desktop/activator-1.3.7-minimal/play-scala-portfolio/app/views/messagebox.scala.html
                  HASH: 572e8d17c2a5ebf66a218e666a3c554d773b1865
                  MATRIX: 537->1|647->16|675->18|839->156|864->161
                  LINES: 20->1|25->1|27->3|31->7|31->7
                  -- GENERATED --
              */
          