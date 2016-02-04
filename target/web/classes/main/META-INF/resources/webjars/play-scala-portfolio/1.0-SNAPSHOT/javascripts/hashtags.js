(function() {
  var Tags, myHtml;

  myHtml = function(index, tweet) {
    return "<div class=\"panel-group\" id=\"accordion\">\n  <div class=\"panel panel-default\">\n     <div class=\"panel-header\">\n           <div class=\"panel-body\"\n               data-toggle=\"collapse\"\n               data-target=\"#collapse" + index + "\">\n               " + tweet + "\n           </div>\n      </div>\n      <div id=\"collapse" + index + "\"\n           class=\"panel-collapse collapse\">\n          <div class=\"panel-footer\">\n          </div>\n      </div>\n  </div>\n</div>";
  };

  Tags = function(a) {
    return $.get("/hashtag/" + a, function(messages) {
      return $.each(messages, function(index, message) {
        return $("#messages").append(myHtml(index, message.tweet));
      });
    });
  };

  $(function() {
    var tagd;
    tagd = $("#tagger").attr("querytag");
    console.log(tagd);
    return Tags(tagd);
  });

}).call(this);

//# sourceMappingURL=hashtags.js.map
