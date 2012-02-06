# Quilt

  <em>Quilt is currently under development. All ideas expressed here are
  subject to change.</em>

## Overview

  Quilt allows web developers to stich together content from different
  sources into a pattern. A pattern is implemented in HTML and CSS and
  provides the basic layout for the final document. A Quilt document
  describes how to fetch content from different sources and how to
  inject it into the pattern.


### What Quilt isn't

  Quilt is not a web-application framework. It is more lightweight than
  a framework. It does not impose a particular programming language for
  your web-application. It does not help you manage the URLs for your
  server. It does not impose a particular design pattern.

  Quilt is not your typical templating engine. It uses CCS3-style selectors
  to specify where to insert content into a layout. The layout and content
  can come from other sources on the web.

### What Quilt is

  Quilt allows developers to further decuple their layouts from their
  content. This was the promise of CSS, but developers frequently still need
  to add div elements to their content to provide hooks for CSS styling.
  These divs usually have nothing to do with the structure of their content.
  They are their to help describe the layout of the page. With HTML5,
  developers now have header, footer, nav, aside, and article to mark up the
  structure of their layout. But it is still the layout, and not content.

  "Who cares if my layout is mixed in with my content?"
    
  Changing the layout for your site becomes more complicated if it is mixed
  up with your content. For example, let's say your site's layout is
  currently implemented using div elements. Now you want to use the new HTML5
  elements. Unless you are using a web-application framework that provides
  templating, or some custom built CGI-based framework, or a separate
  templating mechanism (like Quilt!), you'll be in the unenviable possition
  of trying to make a consistent change accross a large set of files.


### Related Technologies

* Deliverance: http://packages.python.org/Deliverance/
* Psttt!: http://codeassembly.com/Psttt!-I-am-a-different-php-templating-system/
* CSS layouts module: http://www.w3.org/TR/2009/WD-css3-layout-20090402/
* Mozzila Merge on Browse (MOB): http://sdpml.mozdev.org/
* HTML frames and iframe
* Frameworks like Ruby on Rails (http://rubyonrails.org/) and Yii (http://www.yiiframework.com/)
* CGI languages such as Perl (http://www.perl.org/), PHP (http://www.php.net/), and Python (http://python.org/)
* Templating engines such as Smarty (http://www.smarty.net/ ): http://en.wikipedia.org/wiki/Template_engine_(web)


## Other topics

  * Motivation

    * Presentation (style and layout) should be separate from content

      * Diagram

    * CSS separates style, not content

      * Example

    * Quilt separates layout

      * Or quilt separates content

  * Overview

    * Write a layout

    * Write a quilt to stitch content into layout

    * Example

  * Users

    * Website developers (primary)

    * Webserver administrators (secondary)

    * Web consumers (tertiary)

  * Requirements

    * Easy to learn

    * Easy to deploy

    * Easy to configure

    * Easy to maintain

    * Overlay seamlessly with existing technology

      * Browsers

      * Servers

      * Frameworks

      * Basic technology (html, css, http, javascript)

    * Provide added value to existing sites

    * High-performance

    * Common cases are easy

    * Rarer cases are possible

  * Design decisions

    * Where should stitching take place?

      * Client-side

      * Middle-side

      * Server-side

    * How specifically should it be implemented?

      * Client

        * Ajax

        * Browser plugin

      * Middle

        * Proxy server

      * Server

        * Server plugin/handler

        * CGI running on server

      * Compiled core implementation?

    * Syntax and semantics of Quilt (DSL: domain specific language)

      * Base languages: XML, JSON, or Custom

      * Capabilities

  * Open questions

    * How do we prevent infinite recursion caused by url() and cgi()?

      * Especially in the presence of an advisory

    * How do we generalize quilts so they can be reused?

    * If quilt hijacks requests, can quilt play nice with frameworks that also
like to hijack requests?

      * More generally: can two url hijacking frameworks coexist?




