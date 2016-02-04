(function() {
  var myHtml, myHtml2;

  myHtml2 = function(tweet) {
    return "<hr class=\"divider\">\n<div style=\"float: none ;padding-left: 15px;padding-top: 5px;padding-bottom: 5px\">\n" + tweet + "\n</div>";
  };

  myHtml = function(index, tweet) {
    return "<div class=\"panel-group\" id=\"accordion\">\n  <div class=\"panel panel-default\">\n     <div class=\"panel-header\">\n           <div class=\"panel-body\"\n               data-toggle=\"collapse\"\n               data-target=\"#collapse" + index + "\">\n               " + tweet + "\n           </div>\n      </div>\n      <div id=\"collapse" + index + "\"\n           class=\"panel-collapse collapse\">\n      </div>\n  </div>\n</div>";
  };

  $(function() {
    return $.get("/messages", function(messages) {
      return $.each(messages, function(idx, msg) {
        var x, _i, _len, _ref, _results;
        $("#messages").append(myHtml(idx, msg.tweet));
        _ref = msg.otags;
        _results = [];
        for (_i = 0, _len = _ref.length; _i < _len; _i++) {
          x = _ref[_i];
          _results.push($("#collapse" + idx).append(myHtml2(x)));
        }
        return _results;
      });
    });
  });

}).call(this);

//# sourceMappingURL=messages.js.map
